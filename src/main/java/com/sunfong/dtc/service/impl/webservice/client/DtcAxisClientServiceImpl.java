package com.sunfong.dtc.service.impl.webservice.client;

import com.sunfong.dtc.util.webservice.client.WebServiceCilentService;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.LinkedHashMap;

public class DtcAxisClientServiceImpl implements WebServiceCilentService {

    Service service = new Service();

    @Override
    public String invokeWs(String address,String nameSpace, String wsType, String methodName, LinkedHashMap params) {
        Call call = null;
        try {
            call = (Call) service.createCall();
            call.setTargetEndpointAddress(new URL(address));
            //.net 兼容配置
            String optName = "getDataBySql";
            call.setOperationName(new QName(nameSpace, "getDataBySql"));
            //初始化参数
            QName msgQname = new QName(nameSpace,"sql");
            call.addParameter(msgQname, XMLType.SOAP_STRING, javax.xml.rpc.ParameterMode.IN);

            call.setUseSOAPAction(true);
            call.setSOAPActionURI(nameSpace+optName);
            call.setReturnType(XMLType.SOAP_STRING);

            String result = (String) call.invoke(new Object[]{"select 1 from dual"});
            System.out.println(result);
            return result;
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return this.getClass()+this.getClass().getName()+"错误";
    }

//    public static void main(String[] args) {
//        DtcAxisClientServiceImpl dtc =  new DtcAxisClientServiceImpl();
//        dtc.invokeWs();
//    }


}
