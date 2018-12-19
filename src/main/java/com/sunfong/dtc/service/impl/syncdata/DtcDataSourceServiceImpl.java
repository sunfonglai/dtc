package com.sunfong.dtc.service.impl.syncdata;

import com.sunfong.dtc.dob.entity.syncdata.DtcDataSource;
import com.sunfong.dtc.mapper.syncdata.DtcDataSourceMapper;
import com.sunfong.dtc.service.itf.syncdata.DtcDataSourceService;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wfr14
 */
@Service
public class DtcDataSourceServiceImpl implements DtcDataSourceService {

    @Autowired
    DtcDataSourceMapper dcDataSourceMapper;

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Override
    public DtcDataSource getDataSources(String id) {
        DtcDataSource dcs = dcDataSourceMapper.selectByPrimaryKey(id);
        return dcs;
    }

    @Override
    public List getDataSources() {
        return dcDataSourceMapper.selectDataSource();
    }

    @Override
    public List selectBySql(String sql) {
        return dcDataSourceMapper.selectBySql(sql);
    }

    @Override
    public int deleteBySql(String sql) {
        return dcDataSourceMapper.deleteBySql(sql);
    }

    @Override
    public int insertBySql(String sql) {
        return dcDataSourceMapper.insertBySql(sql);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int batchInsertBySqlSession(List dataList) {
        long startTime = System.currentTimeMillis();
        System.out.println("开始批量插入数据，共"+dataList.size()+"条");
        SqlSession sqlSession = null;
        try{
            sqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
            System.out.println("插入数据开始");
            for (int i = 0; i < dataList.size(); i++) {
                try {
                    dcDataSourceMapper.insertBySql((String) dataList.get(i));
                }catch (Exception e){
                    System.out.println("数据异常"+dataList.get(i).getClass());
                    System.out.println(e.getMessage());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("插入数据结束，用时"+(endTime-startTime)+"ms");
        return dataList.size();
    }
}
