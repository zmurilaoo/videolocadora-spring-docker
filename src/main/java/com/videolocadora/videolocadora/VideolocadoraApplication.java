package com.videolocadora.videolocadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication

@EnableJpaAuditing //Aditoria
public class VideolocadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideolocadoraApplication.class, args);
	}

}
