package com.weha.job_schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JobScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobScheduleApplication.class, args);
	}

}
