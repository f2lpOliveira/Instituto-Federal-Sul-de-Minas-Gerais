package br.com.concessionaria;

import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.veiculos.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {

			Veiculo cliente1 = new Veiculo("KTO-1322", 2000, 2000, "2000KTO-1322", "Preto", 220000);
			Veiculo cliente2 = new Veiculo("ZTA-2215", 2005, 2006, "2005ZTA-2215", "Verde", 180000);
			Veiculo cliente3 = new Veiculo("ORG-7330", 2008, 2007, "2008ORG-7330", "Branco", 120000);

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

			Mecanico colaborador1 = new Mecanico("João", 10, 3);
			Mecanico colaborador2 = new Mecanico("Francisco", 8, 3);
			Mecanico colaborador3 = new Mecanico("Jorge", 6, 2);


    }
}
