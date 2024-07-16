package com.pruebaTecnicaAngieTejeda.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.client.WebClient;


@SpringBootApplication(scanBasePackages = "com.pruebaTecnicaAngieTejeda")
@EnableJpaRepositories(basePackages = "com.pruebaTecnicaAngieTejeda")
@EntityScan(basePackages = "com.pruebaTecnicaAngieTejeda")
public class MicroserviciosProductosApplication {

    public static void main(String[] args) {
	SpringApplication.run(MicroserviciosProductosApplication.class, args);
    }
    
    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}


