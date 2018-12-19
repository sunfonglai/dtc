package com.sunfong.dtc.service.impl.webservice;

import com.sunfong.dtc.dob.entity.webservice.DtcWsConfig;
import com.sunfong.dtc.service.itf.webservice.DtcWsConfigService;
import com.sunfong.dtc.service.itf.webservice.DtcWsMethodDetailService;
import com.sunfong.dtc.service.itf.webservice.DtcWsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wfr14
 */
@Service
public class DtcWsServiceImpl implements DtcWsService {

    @Autowired
    DtcWsConfigService dtcWsConfigService;

    @Autowired
    DtcWsMethodDetailService dtcWsMethodDetailService;


    @Override
    public List getWsDetailList() {
        return dtcWsMethodDetailService.getWsDetailList();
    }
}
