package com.yuan.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yuan.service.DubboTestService;

/**
 * @author yuan
 * @date 2020/3/19 16:40
 */

@Service
public class DubboTestServiceImpl implements DubboTestService {
    @Override
    public String dubboTest() {
        return "success";
    }
}
