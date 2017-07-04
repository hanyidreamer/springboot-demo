package com.itoche.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @description: Application
 * @author: zhanghanyi5
 * @createTime: 2017/6/30 11:49
 */
@Controller
@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages = "com.itoche.demo.mapper")
public class Application extends WebMvcConfigurerAdapter
{
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/")
	String home()
	{
		return "redirect:cities";
	}
}
