package com.sunfong.dtc.controller.syncdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/dtc/test")
public class DtcTestController {

//    @Autowired
//    private ConsulDiscoveryClient consulDiscoveryClient;

    @RequestMapping(value = "/consul")
    public String testconsul(){
//        List<ServiceInstance> serviceInstanceList = consulDiscoveryClient.getInstances("plf");
//        ServiceInstance serviceInstance = serviceInstanceList.get(0);
//        System.out.println("服务地址：" + serviceInstance.getUri());
//        System.out.println("服务名称：" +serviceInstance.getServiceId());
//
//        String callServiceResult = new RestTemplate().getForObject(serviceInstance.getUri().toString()+"/data/plf/check/alive",String.class);
//        System.out.println(callServiceResult);

        return "success";
    }
}
