package com.yuan.manage.util;

import org.apache.commons.lang3.StringUtils;
import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author yuan
 * @date 2020/3/20 16:23
 */
public class PmsFileUpLoadUtil {

    public static final String TRACKER_IPADDR = "http://192.168.145.30";

    public static String uploadImg(MultipartFile file) throws IOException, MyException {

        StringBuilder imgUrl = new StringBuilder(TRACKER_IPADDR + "");

        String path = PmsFileUpLoadUtil.class.getResource("/tracker.conf").getPath();

        ClientGlobal.init(path);

        TrackerClient trackerClient = new TrackerClient();

        TrackerServer server = trackerClient.getConnection();

        StorageClient storageClient = new StorageClient(server, null);

        byte[] fileBytes = file.getBytes();

        String[] splits = StringUtils.split(file.getOriginalFilename(), '.');
        String extName = splits != null ? splits[splits.length - 1] : "";
        String[] uploadInfos = storageClient.upload_file(fileBytes, extName, null);

        for (String uploadInfo : uploadInfos) {
            imgUrl.append('/').append(uploadInfo);
        }

        return imgUrl.toString();
    }
}
