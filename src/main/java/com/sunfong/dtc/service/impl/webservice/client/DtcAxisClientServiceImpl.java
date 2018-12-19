package com.sunfong.dtc.service.impl.webservice.client;

import com.sunfong.dtc.dob.entity.webservice.DtcWsConfig;
import com.sunfong.dtc.util.webservice.client.WebServiceCilentService;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.LinkedHashMap;

/**
 * @author wfr14
 */
@org.springframework.stereotype.Service
public class DtcAxisClientServiceImpl implements WebServiceCilentService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    Service service = new Service();

    @Override
    public String invokeWs(DtcWsConfig dtcWsConfig, String methodName, LinkedHashMap params) {
        Call call = null;
        try {
            String url = dtcWsConfig.getUrl();
            call = (Call) service.createCall();
            call.setTargetEndpointAddress(new URL(url));
            //.net 兼容配置
            String optName = "getDataBySql";
            call.setOperationName(new QName(dtcWsConfig.getNameSpace(), "getDataBySql"));
            //初始化参数
            QName msgQname = new QName(dtcWsConfig.getNameSpace(),"sql");
            call.addParameter(msgQname, XMLType.SOAP_STRING, javax.xml.rpc.ParameterMode.IN);

            call.setUseSOAPAction(true);
            call.setSOAPActionURI(dtcWsConfig.getNameSpace()+optName);
            call.setReturnType(XMLType.SOAP_STRING);

            logger.debug("调用远程webservice。调用路径为 url:{},调用方法为optName:{},调用参数为",url,optName);
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
