package com.sunfong.dtc.service.impl.syncdata;

import com.sunfong.dtc.mapper.syncdata.DtcTableWhiteListMapper;
import com.sunfong.dtc.service.itf.syncdata.DtcTableWhiteListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wfr14
 */
@Service
public class DtcTableWhiteListServiceImpl implements DtcTableWhiteListService {

    @Autowired
    DtcTableWhiteListMapper dtcTableWhiteListMapper;

    @Override
    public List getTablesBySourceId(String id) {
        return dtcTableWhiteListMapper.getTablesBySourceId(id);
    }
}
