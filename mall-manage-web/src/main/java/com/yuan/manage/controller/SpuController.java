package com.yuan.manage.controller;

import com.yuan.manage.util.PmsFileUpLoadUtil;
import com.yuan.service.SpuService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author yuan
 * @date 2020/3/20 16:16
 */

@Controller
public class SpuController {

    @Reference
    SpuService spuService;

    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile) {

        String imgUrl = "";

        try {
            imgUrl = PmsFileUpLoadUtil.uploadImg(multipartFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return imgUrl;
    }
}
