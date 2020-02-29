package io.defecttracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DefectTrackerConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefectTrackerConfigServerApplication.class, args);
	}

}
