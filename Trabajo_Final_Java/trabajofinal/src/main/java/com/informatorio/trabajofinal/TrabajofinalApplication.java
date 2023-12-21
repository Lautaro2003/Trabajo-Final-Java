package com.informatorio.trabajofinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EntityScan(basePackages = "com.informatorio.trabajofinal.entity")
@EnableJpaAuditing
public class TrabajofinalApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TrabajofinalApplication.class, args);

		String databaseUrl = context.getEnvironment().getProperty("spring.datasource.url");
        System.out.println("Ruta de la base de datos: " + databaseUrl);	
	}

}
