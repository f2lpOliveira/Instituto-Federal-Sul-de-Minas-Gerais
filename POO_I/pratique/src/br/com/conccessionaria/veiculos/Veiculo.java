package br.com.conccessionaria.veiculos;

public class Veiculo {

	private String placa;
	private int ano;
	private int modelo;
	private String numeroChassi;
	private String cor;
	private int kmRodados;

	public String getPlaca() {
		return this.placa;
	}
	public int getAno() {
		return this.ano;
	}
	public int getModelo() {
		return this.modelo;
	}
	public String getNumeroChassi() {
		return this.numeroChassi;
	}
	public String getCor() {
		return this.cor;
	}
	public int getKmRodados() {
		return this.kmRodados;
	}	

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public void setNumeroChassi(String numeroChassi) {
		this.numeroChassi = numeroChassi;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setKmRodados(int kmRodados) {
		this.kmRodados = kmRodados;
	}

	public String exibeInformacoesDoVeiculo (String placa, int ano, int modelo, String numeroChassi, String cor, int kmRodados){
		return "";
	}
}
