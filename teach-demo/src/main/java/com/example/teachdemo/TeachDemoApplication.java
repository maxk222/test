package com.example.teachdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan //配置druid必须加的注解，如果不加，访问页面打不开，filter和servlet、listener之类的需要单独进行注册才能使用，spring boot里面提供了该注解起到注册作用
//这里还要添加一个总的注解，具体忘记了
public class TeachDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachDemoApplication.class, args);
	}
}
