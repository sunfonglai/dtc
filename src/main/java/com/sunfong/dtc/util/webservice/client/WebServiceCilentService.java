package com.sunfong.dtc.util.webservice.client;


import com.sunfong.dtc.dob.entity.webservice.DtcWsConfig;

import java.util.LinkedHashMap;

/**
 * @author wfr14
 */
public interface WebServiceCilentService {

    /**
     * 用于用动态调用的方式访问对方服务
     * @param dtcWsConfig 调用的webservice配置信息
     * @param methodName 访问方法名称
     * @param params 参数
     * @return 返回调用的结果
     */
    String invokeWs(DtcWsConfig dtcWsConfig, String methodName, LinkedHashMap params);


}
