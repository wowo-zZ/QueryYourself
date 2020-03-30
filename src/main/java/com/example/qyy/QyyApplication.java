package com.example.qyy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.qyy.mapper")
public class QyyApplication {

	public static void main(String[] args) {
		SpringApplication.run(QyyApplication.class, args);
	}

}
