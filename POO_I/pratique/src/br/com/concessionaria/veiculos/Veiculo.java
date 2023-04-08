package br.com.concessionaria.veiculos;

public class Veiculo {

	// Atributos da Classe
	private String placa;
	private int ano;
	private int modelo;
	private String numeroChassi;
	private String cor;
	private int kmRodados;
	
	// Getters e Setters (Definição e Recuperação de Valores dos Atributos da Classe)
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getModelo() {
		return this.modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getNumeroChassi() {
		return this.numeroChassi;
	}
	public void setNumeroChassi(String numeroChassi) {
		this.numeroChassi = numeroChassi;
	}
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getKmRodados() {
		return this.kmRodados;
	}	
	public void setKmRodados(int kmRodados) {
		this.kmRodados = kmRodados;
	}

	// Construtor da Classe
	public Veiculo (String placa, int ano, int modelo, String numeroChassi, String cor, int kmRodados){
		this.placa = placa;
		this.ano = ano;
		this.modelo = modelo;
		this.numeroChassi = numeroChassi;
		this.cor = cor;
		this.kmRodados = kmRodados;
	}

	public void informarQuilometragem (int quilometragem){
		this.kmRodados = quilometragem;
	}

}
