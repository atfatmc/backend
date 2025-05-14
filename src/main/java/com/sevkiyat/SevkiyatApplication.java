package com.sevkiyat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
@EntityScan(basePackages = "com.sevkiyat.entity")
@ComponentScan(basePackages = "com.sevkiyat")
public class SevkiyatApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();

		System.setProperty("WRITEDB_URL", dotenv.get("WRITEDB_URL"));
        System.setProperty("WRITEDB_USERNAME", dotenv.get("WRITEDB_USERNAME"));
        System.setProperty("WRITEDB_PASSWORD", dotenv.get("WRITEDB_PASSWORD"));

		System.setProperty("READDB_URL", dotenv.get("READDB_URL"));
        System.setProperty("READDB_USERNAME", dotenv.get("READDB_USERNAME"));
        System.setProperty("READDB_PASSWORD", dotenv.get("READDB_PASSWORD"));

		SpringApplication.run(SevkiyatApplication.class, args);
	}

}
