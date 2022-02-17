package com.basa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//habilitar para apliccaiones desplegadas en servidor
//public class AppRunner extends SpringBootServletInitializer {
//
//	public static void main(String[] args) {
//		SpringApplication.run(AppRunner.class, args);
//	}
//
//}

//inicializdor para SpringBoot microperfil
public class AppRunner  {

	public static void main(String[] args) {
		SpringApplication.run(AppRunner.class, args);
	}
}

