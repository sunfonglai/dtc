package com.sunfong.dtc.service.impl.webservice.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * @author wfr14
 */
public class DtcCxfClientServiceImpl {


    JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();

    public String invokeWs(){
        //创建动态客户端
        dcf = JaxWsDynamicClientFactory.newInstance();
        String adress = "http://localhost:7341/sbjc/FM_WS/service/BankWs?wsdl";
        Client client = dcf.createClient(adress);
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            client.invoke("getDataBySql", "select 1 from dual");
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }


        return "";
    }

//    public static void main(String[] args) {
//        DtcCxfClientServiceImpl dtcCxfClientService = new DtcCxfClientServiceImpl();
//        dtcCxfClientService.invokeWs();
//    }
}
