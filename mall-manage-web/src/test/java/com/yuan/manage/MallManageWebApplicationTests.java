package com.yuan.manage;

import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
class MallManageWebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void fdfs() throws IOException, MyException {

        String path = MallManageWebApplicationTests.class.getResource("/tracker.conf").getPath();

        ClientGlobal.init(path);

        TrackerClient trackerClient = new TrackerClient();

        TrackerServer server = trackerClient.getConnection();

        StorageClient storageClient = new StorageClient(server, null);

        String[] uploadInfos = storageClient.upload_file("D:\\BaiduNetdiskDownload\\img.jpg", "jpg", null);

        for (String uploadInfo : uploadInfos) {
            System.out.println(uploadInfo);
        }
    }
}
