package br.com.jr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CambioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CambioServiceApplication.class, args);
	}

}
