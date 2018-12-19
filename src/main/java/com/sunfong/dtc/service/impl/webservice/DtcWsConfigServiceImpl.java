package com.sunfong.dtc.service.impl.webservice;


import com.sunfong.dtc.dob.entity.webservice.DtcWsConfig;
import com.sunfong.dtc.mapper.webservice.DtcWsConfigMapper;
import com.sunfong.dtc.service.itf.webservice.DtcWsConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wfr14
 */
@Service
public class DtcWsConfigServiceImpl implements DtcWsConfigService {

    @Autowired
    DtcWsConfigMapper dtcWsConfigMapper;

    @Override
    public DtcWsConfig getWsById(String id) {
        return dtcWsConfigMapper.selectById(id);
    }
}
