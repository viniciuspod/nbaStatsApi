package br.com.vdantas.nbaStatsApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NbaStatsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NbaStatsApiApplication.class, args);
	}

}
