package br.com.concessionaria.funcionarios;

public class Mecanico {

	// Atributos da Classe
	private String nome;
	private int anosExperiencia;
	private int carrosSimultaneos;

	// Getters e Setters (Definição e Recuperação de Valores dos Atributos da Classe)
	public String getNome() {
		return this.nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnosExperiencia() {
		return this.anosExperiencia;
	}	
	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}
	public int getCarrosSimultaneos() {
		return this.carrosSimultaneos;
	}	
	public void setCarrosSimultaneos(int carrosSimultaneos) {
		this.carrosSimultaneos = carrosSimultaneos;
	}

	// Construtor da Classe
	public Mecanico (String nome, int anosExperiencia, int carrosSimultaneos){
		this.nome = nome;
		this.anosExperiencia = anosExperiencia;
		this.carrosSimultaneos = carrosSimultaneos;
	}

}
