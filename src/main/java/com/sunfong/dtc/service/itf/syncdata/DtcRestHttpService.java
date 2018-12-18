package com.sunfong.dtc.service.itf.syncdata;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface DtcRestHttpService {


    /**
     * @param params 请求参数
     * @return  返回报文
     */
     String postHttp(Map params);
}
