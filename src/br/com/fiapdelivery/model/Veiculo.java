package br.com.fiapdelivery.model;

public class Veiculo {
	
	private String placa;
	
	private double capacidadeKg;
	
	public Veiculo(String placa, double capacidadeKg) {
		this.placa = placa;
		this.setCapacidadeKg(capacidadeKg);
	}

	public void mudarPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getPlaca() {
		return placa;
	}

	public double getCapacidadeKg() {
		return capacidadeKg;
	}

	private void setCapacidadeKg(double capacidadeKg) {
		if (capacidadeKg <= 0) {
			System.out.println("Capacidade inválida: Apenas valores positivos");
		} else {
			this.capacidadeKg = capacidadeKg;
		}
	}

}
