package com.sunfong.dtc.service.itf.syncdata;

import java.util.List;
import java.util.Map;

public interface DtcCurrentTaskDetailService {

    int batchInsert(List detailList);

//   通过Mybatis SqlSession 批量提交
    int batchInsertBySqlSession(List detailList);

//   通过条件获取删除任务列表
    List selectByMap(Map paramsMap);

    //   通过主任务ID和操作类型获取需要操作的表
    List selectDistinctTablesByMainTaskIdAndOptType(String mainTaskId, String optType);

//
    int deleteByDetailTaskId(String detailTaskId);



}
