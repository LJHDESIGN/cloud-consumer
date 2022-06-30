package com.cloud.cloudconsumer.service.impl;

import com.cloud.cloudconsumer.client.HelloClient;
import com.cloud.cloudconsumer.service.CloudService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class CloudServiceImpl implements CloudService {

    @Resource
    private HelloClient helloClient;

    @Override
    public String hi(String name) {
        log.info("服务端接口：hi，被掉用了");
        return helloClient.hi("我来消费啦哈哈哈");
    }
}
