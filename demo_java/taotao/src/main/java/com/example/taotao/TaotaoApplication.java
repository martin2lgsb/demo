package com.example.taotao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.taotao")
public class TaotaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaotaoApplication.class, args);
	}
}
