package io.defecttracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DefectDetailsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefectDetailsMsApplication.class, args);
	}

}
