package com.yuan.manage.controller;

import com.yuan.manage.util.PmsFileUpLoadUtil;
import com.yuan.service.SpuService;
import org.csource.common.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author yuan
 * @date 2020/3/20 16:16
 */

@Controller
public class SpuController {

    SpuService spuService;

    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(MultipartFile multipartFile) {

        String imgUrl = "";

        try {
            imgUrl = PmsFileUpLoadUtil.uploadImg(multipartFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return imgUrl;
    }
}
