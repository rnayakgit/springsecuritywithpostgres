package com.java.security.application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication(scanBasePackages = {
		"com.java.security.controller",
		"com.java.security.service",
}
)
@EnableJpaRepositories(basePackages = "com.java.security.repository")
@EntityScan(basePackages = "com.java.security.model")
public class SpringClientApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    System.out.println("Scopes-- > "+args);		
	}

	

}
