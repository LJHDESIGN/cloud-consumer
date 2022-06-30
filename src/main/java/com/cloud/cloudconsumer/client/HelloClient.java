package com.cloud.cloudconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author linjianhui
 * @description
 * @date 2022/6/29 2:12 下午
 */
@FeignClient("cloud-provider")
public interface HelloClient {

    @GetMapping("/hello/serviceTestA")
    String hi(@RequestParam(value = "name", defaultValue = "forezp", required = false) String name);

}
