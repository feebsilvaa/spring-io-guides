package com.feedev.gs02schedulingtasks.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Gs02SchedulingTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gs02SchedulingTasksApplication.class, args);
	}

}
