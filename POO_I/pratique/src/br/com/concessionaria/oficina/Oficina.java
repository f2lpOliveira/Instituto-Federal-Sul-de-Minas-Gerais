package br.com.concessionaria.oficina;

import java.util.ArrayList;

import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.veiculos.Veiculo;

public class Oficina {

	// Atributos da Classe
	private String nomeOficina;
	private ArrayList<Mecanico> listaMecanicos;
	private ArrayList<Peca> listaPecas;
	private ArrayList<Veiculo> listaVeiculos;
	private int pecasNecessarias;

	// Construtor da Classe
	public Oficina (String nomeOficina){
		this.nomeOficina = nomeOficina;
	}

	// Getters e Setters (Definição e Recuperação de Valores dos Atributos da Classe)
	public String getNomeOficina() {
		return this.nomeOficina;
	}
	public void setNomeOficina(String nomeOficina) {
		this.nomeOficina = nomeOficina;
	}
	public ArrayList<Mecanico> getListaMecanicos() {
		return this.listaMecanicos;
	}
	public void setListaMecanicos(ArrayList<Mecanico> listaMecanicos) {
		this.listaMecanicos = listaMecanicos;
	}
	public ArrayList<Peca> getListaPecas() {
		return this.listaPecas;
	}
	public void setListaPecas(ArrayList<Peca> listaPecas) {
		this.listaPecas = listaPecas;
	}
	public ArrayList<Veiculo> getListaVeiculos() {
		return this.listaVeiculos;
	}
	public void setListaVeiculos(ArrayList<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}
	public int getPecasNecessarias() {
		return this.pecasNecessarias;
	}
	public void setPecasNecessarias(int pecasNecessarias) {
		this.pecasNecessarias = pecasNecessarias;
	}

	public void adicionarMecanico(Mecanico mecanico){
		this.listaMecanicos.add(mecanico);
	}
	public void removerMecanico(Mecanico mecanico){
		this.listaMecanicos.remove(mecanico);
	}
	public void adicionarPeca(Peca peca){
		this.listaPecas.add(peca);
	}
	public void removerPeca(Peca peca){
		this.listaPecas.remove(peca);
	}
	public void adicionarVeiculo(Veiculo veiculo){
		this.listaVeiculos.add(veiculo);
	}
	public void removerVeiculo(Veiculo veiculo){
		this.listaVeiculos.remove(veiculo);
	}
	public int verificarPecasRevisao(){
		return 0;
	}
	public boolean realizarRevisaoVeiculos(){
		return true;
	}
	public float valorTotalPecas(){
		return 0;
	}

}
