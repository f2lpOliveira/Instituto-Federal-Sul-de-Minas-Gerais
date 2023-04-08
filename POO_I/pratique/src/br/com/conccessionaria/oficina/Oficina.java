package br.com.conccessionaria.oficina;

import java.util.ArrayList;

import br.com.conccessionaria.estrutura.Peca;
import br.com.conccessionaria.funcionarios.Mecanico;
import br.com.conccessionaria.veiculos.Veiculo;

public class Oficina {

	// Atributos da Classe
	private String nomeOficina;
	private ArrayList<Mecanico> listaMecanicos;
	private ArrayList<Peca> listaPecas;
	private ArrayList<Veiculo> listaVeiculos;
	private int pecasNecessarias;

	// Construtor da Classe
	public Oficina (String nomeOficina, int pecasNecessarias){
		this.nomeOficina = nomeOficina;
		this.pecasNecessarias = pecasNecessarias;
	}
}
