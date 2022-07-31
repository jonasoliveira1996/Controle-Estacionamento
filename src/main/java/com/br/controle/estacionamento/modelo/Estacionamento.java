package com.br.controle.estacionamento.modelo;

import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "estacionamento")
public class Estacionamento {
	
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
	
	@Column(nullable = false, unique = true, length = 10)
	private String numeroVagaEstacionamento;
	
	@Column(nullable = false, unique = true, length = 10)
	private String placaCarro;
	
	@NotBlank
	private String marcaCarro;
	
	@NotBlank
	private String modeloCarro;
	
	@NotBlank
	private String corCarro;
	
	@Column(nullable = false)
	private LocalDateTime dataRegistro;
	
	@NotBlank
	private String nomeResponsavel;
	
	@NotBlank
	private String apartamento;
	
	@NotBlank
	private String bloco;
	
	public Estacionamento(Long id, String numeroVagaEstacionamento, String placaCarro, String marcaCarro, String modeloCarro,
			String corCarro, LocalDateTime dataRegistro, String nomeResponsavel, String apartamento, String bloco) {
		super();
		this.id = id;
		this.numeroVagaEstacionamento = numeroVagaEstacionamento;
		this.placaCarro = placaCarro;
		this.marcaCarro = marcaCarro;
		this.modeloCarro = modeloCarro;
		this.corCarro = corCarro;
		this.dataRegistro = dataRegistro;
		this.nomeResponsavel = nomeResponsavel;
		this.apartamento = apartamento;
		this.bloco = bloco;
	}
	
	public Estacionamento() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroVagaEstacionamento() {
		return numeroVagaEstacionamento;
	}

	public void setNumeroVagaEstacionamento(String numeroVagaEstacionamento) {
		this.numeroVagaEstacionamento = numeroVagaEstacionamento;
	}

	public String getPlacaCarro() {
		return placaCarro;
	}

	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}

	public String getMarcaCarro() {
		return marcaCarro;
	}

	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getApartamento() {
		return apartamento;
	}

	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	
}
