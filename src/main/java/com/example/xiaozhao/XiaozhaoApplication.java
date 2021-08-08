package com.example.xiaozhao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.xiaozhao.mapper")
public class XiaozhaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(XiaozhaoApplication.class, args);
	}

}
