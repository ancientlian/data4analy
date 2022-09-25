package com.data.analy.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lian_tiam
 * @date 2022-09-25
 */
@SpringBootApplication(scanBasePackages = { "com.data.analy" })
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
