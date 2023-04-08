package br.com.concessionaria;

import br.com.concessionaria.estrutura.*;
import br.com.concessionaria.funcionarios.*;
import br.com.concessionaria.oficina.*;
import br.com.concessionaria.veiculos.*;

public class App {
    public static void main(String[] args) throws Exception {

			// Declarando 3 objetos diferentes da classe Veiculo
			Veiculo cliente1 = new Veiculo("KTO-1322", 2000, 2000, "2000KTO-1322", "Preto", 220000);
			Veiculo cliente2 = new Veiculo("ZTA-2215", 2005, 2006, "2005ZTA-2215", "Verde", 180000);
			Veiculo cliente3 = new Veiculo("ORG-7330", 2008, 2007, "2008ORG-7330", "Branco", 120000);

			// Declarando 10 objetos diferentes da classe Peca
			Peca item1 = new Peca("Parachoque", 200.13f, "21/01/2022");
			Peca item2 = new Peca("Pastilha de Freio", 93.10f, "21/01/2022");
			Peca item3 = new Peca("Radiador", 225.97f, "21/01/2022");
			Peca item4 = new Peca("Filto de Combustível", 20.71f, "25/03/2022");
			Peca item5 = new Peca("Filtro de Ar", 22.43f, "25/03/2022");
			Peca item6 = new Peca("Esticador", 193.11f, "25/03/2022");
			Peca item7 = new Peca("Arranque", 300.08f, "14/05/2022");
			Peca item8 = new Peca("Alternador", 150.71f, "14/05/2022");
			Peca item9 = new Peca("Catalisador", 900.15f, "22/08/2022");
			Peca item10 = new Peca("Jogo de Velas", 100.03f, "24/08/2022");

			// Declarando 3 objetos diferentes da classe Mecanico
			Mecanico colaborador1 = new Mecanico("João", 10, 3);
			Mecanico colaborador2 = new Mecanico("Francisco", 8, 3);
			Mecanico colaborador3 = new Mecanico("Jorge", 6, 2);

			// Declarando 1 objeto da classe Oficina
			Oficina oficina = new Oficina("Volte Sempre");

			// Adicionando veículos, motoristas e peças no objeto Oficina
			oficina.adicionarVeiculo(cliente1);
			oficina.adicionarVeiculo(cliente2);
			oficina.adicionarVeiculo(cliente3);

			oficina.adicionarMecanico(colaborador1);
			oficina.adicionarMecanico(colaborador2);
			oficina.adicionarMecanico(colaborador3);

			oficina.adicionarPeca(item1);
			oficina.adicionarPeca(item2);
			oficina.adicionarPeca(item3);
			oficina.adicionarPeca(item4);
			oficina.adicionarPeca(item5);
			oficina.adicionarPeca(item6);
			oficina.adicionarPeca(item7);
			oficina.adicionarPeca(item8);
			oficina.adicionarPeca(item9);
			oficina.adicionarPeca(item10);

			// Utilizando os métodos verificarPecasRevisao e realizarRevisaoVeiculos
			oficina.verificarPecasRevisao();
			oficina.realizarRevisaoVeiculos();

    }
}
