package com.chrysalis2h.consumer.controller;

import com.chrysalis2h.consumer.client.RubbishClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rubbish")
public class RubbishController {

    @Autowired
    private RubbishClient rubbishClient;

    @Value("${wahaha.key}")
    private String hello;

    @RequestMapping("getRubbish")
    public String getRubbish(@RequestParam(required = false) String name) {
        if (StringUtils.isEmpty(name)) {
            return "~~~~~~~~~~~~~~~~~~~~~~";
        }
        return rubbishClient.getRubbish(name);
    }

    @RequestMapping("config")
    public String getConfig(@RequestParam(required = false) String config) {
        if (StringUtils.isEmpty(config)) {
            return "~~~~~~~~~~~~~~~~~~~~~~";
        }
        return this.hello;
    }
}
