package com.sunfong.dtc.service.itf.syncdata;



import com.sunfong.dtc.dob.entity.syncdata.DtcDataSource;

import java.util.List;

/**
 * @author wfr14
 */
public interface DtcDataSourceService {

    DtcDataSource getDataSources(String id);

    List getDataSources();

    List selectBySql(String sql);

    int deleteBySql(String sql);

    int insertBySql(String sql);

    int batchInsertBySqlSession(List dataList);
}
