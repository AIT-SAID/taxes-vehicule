package com.Texes.taxesapiv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.Texes.taxesapiv1.rest")
public class TaxesApiV1Application {

	public static void main(String[] args) {
		SpringApplication.run(TaxesApiV1Application.class, args);
	}

}

