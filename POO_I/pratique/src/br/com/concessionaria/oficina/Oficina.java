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
}
