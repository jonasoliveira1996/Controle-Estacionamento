package com.br.controle.estacionamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.br.controle.estacionamento.modelo")
@EnableJpaRepositories(basePackages = "com.br.controle.estacionamento.repositorios")
@SpringBootApplication
public class ControleEstacionamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleEstacionamentoApplication.class, args);
	}

}
