package com.sunfong.dtc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wfr14
 */
@RestController
@RequestMapping(value = "/data/dtc/check")
public class DtcCheckAliveController {

    @RequestMapping(value = "/alive")
    public String checkAlive(){
        return "Alive";
    }
}
