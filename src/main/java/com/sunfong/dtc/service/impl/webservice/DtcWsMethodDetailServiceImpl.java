package com.sunfong.dtc.service.impl.webservice;

import com.sunfong.dtc.mapper.webservice.DtcWsMethodDetailMapper;
import com.sunfong.dtc.service.itf.webservice.DtcWsMethodDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wfr14
 */

@Service
public class DtcWsMethodDetailServiceImpl implements DtcWsMethodDetailService {

    @Autowired
    DtcWsMethodDetailMapper dtcWsMethodDetailMapper;

    @Override
    public List getWsDetailList() {
        return dtcWsMethodDetailMapper.selectWsServerDetail();
    }
}
