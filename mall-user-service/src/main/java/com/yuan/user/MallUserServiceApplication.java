package com.yuan.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuan
 */
@SpringBootApplication
@EnableDubbo
public class MallUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallUserServiceApplication.class, args);
	}

}
