package com.cloud.cloudconsumer.controller;

import com.cloud.cloudconsumer.service.CloudService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author linjianhui
 * @description
 * @date 2022/6/29 10:48 上午
 */
@RestController
@RequestMapping
public class CloudController {

    @Resource
    private CloudService cloudService;

    @GetMapping("/hi-feign")
    public String hiFeign(){
        return cloudService.hi("我来消费来了哈哈哈");
    }

}
