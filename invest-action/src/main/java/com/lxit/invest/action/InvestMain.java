package com.lxit.invest.action;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication

@EnableEurekaClient
public class InvestMain {

	public static void main(String[] args) {
		new SpringApplicationBuilder(InvestMain.class).web(true).run(args);
	}
}
