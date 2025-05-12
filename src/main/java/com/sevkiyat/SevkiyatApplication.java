package com.sevkiyat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
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
