package com.example.refreshscopenative;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RefreshScopeNativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefreshScopeNativeApplication.class, args);
	}





	class DemoService {
		public String test() {
			return "test";
		}
	}

	@RestController
	class Controler {

		@Autowired DemoService demoService;

		@RequestMapping
		public String hello() {
			return demoService().test();
		}
	}


	@Bean
	@RefreshScope
	DemoService demoService() {
		return new DemoService();
	}
}
