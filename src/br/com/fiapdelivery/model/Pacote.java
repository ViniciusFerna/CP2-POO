package br.com.fiapdelivery.model;

public class Pacote {

	private String codigo;
	
	private double pesoKg;
	
	private String status;
	
	public Pacote(String codigo, double pesoKg, String status) {
		this.codigo = codigo;
		this.setPesoKg(pesoKg);
		this.status = status;
	}
	
	public void mudarStatus(String novoStatus) {
		this.status = novoStatus;
	}
	
	private void setPesoKg(double pesoKg) {
		if (pesoKg <= 0) {
			System.out.println("Peso inválido: Apenas valores positivos");
		} else {
			this.pesoKg = pesoKg;
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public String getStatus() {
		return status;
	}
	
}
