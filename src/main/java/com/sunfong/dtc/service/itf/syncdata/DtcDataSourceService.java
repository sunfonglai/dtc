package com.sunfong.dtc.service.itf.syncdata;



import java.util.List;

public interface DtcDataSourceService {

//    DcDataSourceDTO getDataSources(String id);

    List getDataSources();

    List selectBySql(String sql);

    int deleteBySql(String sql);

    int insertBySql(String sql);

    int batchInsertBySqlSession(List dataList);
}
