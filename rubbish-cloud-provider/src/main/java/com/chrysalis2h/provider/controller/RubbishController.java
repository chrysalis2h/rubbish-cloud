package com.chrysalis2h.provider.controller;

import com.chrysalis2h.provider.service.IRubbishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rubbish")
public class RubbishController {

    @Autowired
    private IRubbishService rubbishService;

    @GetMapping("getRubbish")
    public String getRubbish(@RequestParam(required = false) String name) {
        return rubbishService.productRubbish(name);
    }
}
