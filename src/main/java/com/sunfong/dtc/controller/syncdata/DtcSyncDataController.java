package com.sunfong.dtc.controller.syncdata;


import com.sunfong.dtc.dob.entity.syncdata.DtcDataSource;
import com.sunfong.dtc.dob.entity.syncdata.DtcTableWhiteList;
import com.sunfong.dtc.dob.entity.webservice.DtcWsConfig;
import com.sunfong.dtc.service.itf.syncdata.DtcDataSourceService;
import com.sunfong.dtc.service.itf.syncdata.DtcTableWhiteListService;
import com.sunfong.dtc.service.itf.webservice.DtcWsConfigService;
import com.sunfong.dtc.service.itf.webservice.DtcWsService;
import com.sunfong.dtc.util.webservice.client.WebServiceCilentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wfr14
 */
@RestController
@RequestMapping(value = "/data/dtc/syncData")
public class DtcSyncDataController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    DtcDataSourceService dtcDataSourceService;

    @Autowired
    DtcWsService dtcWsService;

    @Autowired
    DtcTableWhiteListService dtcTableWhiteListService;

    @Autowired
    WebServiceCilentService webServiceCilentService;

    /**
     * @return 获取所有数据源信息
     */
    @RequestMapping(value = "/getDataSource")

    public List getDataSource(){
        return dtcDataSourceService.getDataSources();
    }

    /**
     * @return 获取所有同步计划
     */
    @RequestMapping(value = "/getWsServer")

    public List getWsServer(){
        return dtcWsService.getWsDetailList();
    }

    @RequestMapping(value = "/execSyncData")
    public Object execSyncData(String sourceId){
        logger.debug("接收同步请求，同步源id为id:{}",sourceId);

        logger.debug("执行同步服务地址");
        DtcDataSource dts= dtcDataSourceService.getDataSources(sourceId);
        DtcWsConfig config = new DtcWsConfig();

        logger.debug("执行获取同步表白名单");
        List<DtcTableWhiteList> tableList = dtcTableWhiteListService.getTablesBySourceId(sourceId);
//        创建一个与tableList一一对应的存放处理结果 map的key为表名，value为map对象
        Map<String ,Map>tableMap = new HashMap(tableList.size());

        logger.debug("创建任务扫描");
//        组织查询白名单的SQL
        for (int i = 0; i < tableList.size(); i++) {
            Map<String ,String> taleResultMap  = new HashMap(16);
            DtcTableWhiteList table = tableList.get(i);
            String tableName = table.getTableName();
            String searchCondition = "";
            if ("Y".equals(table.getIsUseParams())){
                searchCondition = " where 1=1 and "+table.getParams();
            }
            String queryTableNumSql = "select count(1) nums from " + tableName + searchCondition;
            taleResultMap.put("queryTableNumSql",queryTableNumSql);
            tableMap.put(tableName,taleResultMap);
        }

//      方便后续采用多线程，
        logger.debug("发送请求到源数据库,接收结果并解析");
        for (Map.Entry<String, Map> entry : tableMap.entrySet()) {
            Map tableSqlMap = entry.getValue();
            String sql = tableSqlMap.get("queryTableNumSql").toString();
            LinkedHashMap requestParamsMap = new LinkedHashMap();
            requestParamsMap.put("xmlStr",sql);
            String resultStr = webServiceCilentService.invokeWs(config,"getDataBySql",requestParamsMap);
//            String resultStr =dcRestHttpService.postHttp(requestParamsMap);

//            解析json字符串
//            System.out.println("请求结果："+ resultStr);
//            List jsonList = (List) JSONObject.parse(resultStr);
//            Map numsMap = (Map)jsonList.get(0);
//            String numsStr = numsMap.get("NUMS").toString();
//            tableSqlMap.put("nums",numsStr);
        }
////        生成任务计划
////        生成主任务
//        DtcCurrentTask dcCurrentTaskDTO = createTask("同步数据");
//        String taskId = dcCurrentTaskDTO.getTaskId();
////        生成子任务列表
//        List <DtcCurrentTaskDetail> detailTaskList = createTaskDetailList(dcCurrentTaskDTO,tableList,tableMap);
//        dcTaskService.insertTask(dcCurrentTaskDTO,detailTaskList);
//        System.out.println("写入计划任务结束");
//
////        执行删除计划
//        System.out.println("执行删除计划");
//        int delTaskNum =  dcTaskService.execDeleteTask(taskId);
//        System.out.println("执行删除计划，共删除"+delTaskNum+"个表数据");
//
////        执行同步数据计划
//        System.out.println("执行同步计划");
//        try {
//            dcTaskService.execSyncInsertTask(taskId);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        System.out.println("执行同步计划结束");



//        return taskId;
        return "111";
    }
}
