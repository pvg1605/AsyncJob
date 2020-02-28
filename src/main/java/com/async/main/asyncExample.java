package com.async.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"async.main","com.practo.commons.queue","com.practo.commons.worker"})
public class asyncExample {

	public static void main(String[] args) {
		SpringApplication.run(asyncExample.class, args);
		
		
	}

}
