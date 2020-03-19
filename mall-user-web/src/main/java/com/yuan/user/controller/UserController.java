package com.yuan.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yuan.service.DubboTestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yuan
 * @date 2020/3/19 15:33
 */
@Controller
public class UserController {

    @Reference
    DubboTestService dubboTestService;

    @GetMapping("index")
    @ResponseBody
    public String index() {
        return dubboTestService.dubboTest();
    }
}
