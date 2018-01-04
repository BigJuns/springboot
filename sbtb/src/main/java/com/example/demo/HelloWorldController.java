package com.example.demo;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	Logger logger = org.slf4j.LoggerFactory.getLogger(HelloWorldController.class);
	
	@RequestMapping("/hello")
	public @ResponseBody String hello(){
		logger.info("hello");
		return "hello world!!";		
	}
}


