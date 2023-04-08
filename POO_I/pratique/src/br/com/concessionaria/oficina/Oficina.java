package br.com.concessionaria.oficina;

import java.util.ArrayList;
import java.util.Random;

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
		// Verifique se a lista de mecânicos é nula
    if (this.listaMecanicos == null) {
			this.listaMecanicos = new ArrayList<>(); // Inicialize a lista se for nula
	}

	this.listaMecanicos.add(mecanico); // Adicione o mecânico à lista
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
		if (this.listaVeiculos == null) { // Verifique se a lista é nula
			this.listaVeiculos = new ArrayList<>(); // Inicialize a lista se for nula
	}
	this.listaVeiculos.add(veiculo); // Adicione o veículo à lista

	// Verifique se a lista de peças é nula
	if (this.listaPecas == null) {
			this.listaPecas = new ArrayList<>(); // Inicialize a lista se for nula
	}

	// Adicionar um número aleatório de peças (de 1 a 3) à lista de peças da oficina
	int numPecas = (int) (Math.random() * 3) + 1;
	for (int i = 0; i < numPecas; i++) {
			Peca peca = new Peca(); // Crie uma instância de Peca aqui
			listaPecas.add(peca);
	}

	// Atualizar o valor do atributo pecasNecessarias
	pecasNecessarias += numPecas;
	}
	public void removerVeiculo(Veiculo veiculo){
		 // Remover o veículo da lista de veículos da oficina
		 listaVeiculos.remove(veiculo);
    
		 // Remover um número aleatório de peças (de 1 a 3) da lista de peças da oficina
		 int numPecas = (int) (Math.random() * 3) + 1;
		 for (int i = 0; i < numPecas; i++) {
				 if (!listaPecas.isEmpty()) {
						 listaPecas.remove(0);
				 }
		 }
		 
		 // Atualizar o valor do atributo pecasNecessarias
		 pecasNecessarias -= numPecas;
	}
	public int verificarPecasRevisao(){
		Random random = new Random();
        return random.nextInt(3) + 1;
	}
	public boolean realizarRevisaoVeiculos(){
		// Verificar se há veículos na lista de veículos da oficina
    if (!listaVeiculos.isEmpty()) {
			// Verificar se há peças suficientes para realizar as revisões de todos os veículos
			if (pecasNecessarias <= listaPecas.size()) {
					// Verificar se há mecânicos suficientes para atender os veículos na oficina
					int numMecanicosNecessarios = (int) Math.ceil((double) listaVeiculos.size() / getCarrosSimultaneos());
					if (numMecanicosNecessarios <= listaMecanicos.size()) {
							// Exibir as placas dos carros
							System.out.println("Placas dos carros a serem revisados:");
							for (Veiculo veiculo : listaVeiculos) {
									System.out.println(veiculo.getPlaca());
							}

							// Exibir os nomes de todos os mecânicos na oficina
							System.out.println("Nomes dos mecânicos na oficina:");
							for (Mecanico mecanico : listaMecanicos) {
									System.out.println(mecanico.getNome());
							}

							// Exibir os dados de todas as peças na oficina
							System.out.println("Dados de todas as peças na oficina:");
							for (Peca peca : listaPecas) {
									System.out.println("Nome: " + peca.getNome() + ", Valor: " + peca.getValor());
							}

							// Retornar true, indicando que foi possível realizar as revisões simultaneamente
							return true;
					} else {
							System.out.println("Não há mecânicos suficientes para atender os veículos na oficina.");
					}
			} else {
					System.out.println("Não há número suficiente de peças para realizar as revisões de todos os veículos.");
			}
	} else {
			System.out.println("Não há veículos para revisão na oficina.");
	}

	// Retornar false, indicando que não foi possível realizar as revisões simultaneamente
	return false;
	}
	private int getCarrosSimultaneos() {
		int carrosSimultaneos = 0;
		for (Mecanico mecanico : listaMecanicos) {
				if (mecanico.getCarrosSimultaneos() > carrosSimultaneos) {
						carrosSimultaneos = mecanico.getCarrosSimultaneos();
				}
		}
		return carrosSimultaneos;
}
	public float valorTotalPecas(){
		float valorTotal = 0;
		for (Peca peca : listaPecas) {
				valorTotal += peca.getValor();
		}
		return valorTotal * pecasNecessarias;
	}

}
