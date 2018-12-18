package com.sunfong.dtc.util.webservice.client;


import java.util.LinkedHashMap;

/**
 * @author wfr14
 */
public interface WebServiceCilentService {

    /**
     * 用于用动态调用的方式访问对方服务
     *
     * @param address 访问地址
     * @param nameSpace 命名空间
     * @param wsType 对方webservice类型
     * @param methodName 访问方法名称
     * @param params 参数
     * @return 返回调用的结果
     */
    String invokeWs(String address ,String nameSpace, String wsType ,String methodName, LinkedHashMap params);


}
