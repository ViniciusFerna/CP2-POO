package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Teste 1 (Caminhao)");
		
		// String placa, double capacidadeKg, int quantidadeEixos
		Caminhao caminhao1 = new Caminhao("FIAP-2026", 1000, 2);
		
		// String codigo, double pesoKg, String status
		Pacote pacote1 = new Pacote("213267", 10, "PENDENTE");
		
		Rota rota1 = new Rota(pacote1, caminhao1);
		
		rota1.iniciarRota();
		
		System.out.println("Teste 2 (Moto)");
		
		// String placa, double capacidadeKg, boolean temBau
		Moto moto1 = new Moto("BRA2E19", 30, true);
		
		Pacote pacote2 = new Pacote("329032", 5, "PENDENTE");
		
		Rota rota2 = new Rota(pacote2, moto1);
		
		rota2.iniciarRota();
		
		System.out.println("Teste 3 (Valores negativos)");
		
		Caminhao caminhao2 = new Caminhao("BRA2E20", -10, 0);
		
		Pacote pacote3 = new Pacote("329032", -10, "CONCLUIDO");

	}

}
