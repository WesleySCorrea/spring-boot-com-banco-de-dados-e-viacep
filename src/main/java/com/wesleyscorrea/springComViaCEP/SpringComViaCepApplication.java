package com.wesleyscorrea.springComViaCEP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringComViaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringComViaCepApplication.class, args);
	}

}
