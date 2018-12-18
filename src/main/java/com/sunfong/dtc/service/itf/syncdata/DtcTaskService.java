package com.sunfong.dtc.service.itf.syncdata;


public interface DtcTaskService {

//    boolean insertTask(DcCurrentTaskDTO dcCurrentTaskDTO, List<DcCurrentTaskDetailDTO> detailDTOList);

    int execDeleteTask(String taskId);

    int execSyncInsertTask(String taskId);
}
