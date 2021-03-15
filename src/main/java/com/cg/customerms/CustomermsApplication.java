package com.cg.customerms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cg.ui.CustomerUI;

@SpringBootApplication
public class CustomermsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomermsApplication.class, args);
		ConfigurableApplicationContext context =  SpringApplication.run(CustomermsApplication.class, args);
		CustomerUI customerUI = context.getBean(CustomerUI.class);
		customerUI.start();
	}

}
