package br.com.concessionaria.estrutura;

public class Peca {

	// Atributos da Classe
	private String nome;
	private float valor;
	private String dataCompra;

	// Getters e Setters (Definição e Recuperação de Valores dos Atributos da Classe)
	public String getNome() {
		return this.nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return this.valor;
	}	
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDataCompra() {
		return this.dataCompra;
	}	
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

	// Construtor da Classe
	public Peca() {
	}

	public Peca (String nome, float valor, String dataCompra){
		this.nome = nome;
		this.valor = valor;
		this.dataCompra = dataCompra;
	}

}
