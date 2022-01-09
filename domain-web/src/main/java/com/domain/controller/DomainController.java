package com.domain.controller;

import com.domain.IDomainStoreService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xielongfei
 * @date: 2022/01/09
 * @description: http接口
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class DomainController {

    @Autowired
    private IDomainStoreService storeService;

    @ApiOperation(value = "获取短域名")
    @GetMapping(value = "/getShortDomain")
    public Object getShortDomain(String url){
        String text = storeService.addDomain(url);
        return text;
    }

    @ApiOperation(value = "获取长域名")
    @GetMapping(value = "/getLongDomain")
    public Object getLongDomain(String url){
        String text = storeService.getDomain(url);
        return text;
    }

}
