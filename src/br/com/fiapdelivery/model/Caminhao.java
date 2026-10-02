package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo{

	private int quantidadeEixos;
	
	public Caminhao(String placa, double capacidade, int quantidadeEixos) {
		super(placa, capacidade);
		this.setQuantidadeEixos(quantidadeEixos);
	}
	
	public int getQuantidadeEixos() {
		return quantidadeEixos;
	}

	private void setQuantidadeEixos(int quantidadeEixos) {
		if (quantidadeEixos <= 0) {
			System.out.println("Quantidade de eixos inválida: Apenas valores positivos");
		} else {
			this.quantidadeEixos = quantidadeEixos;
		}
		
	}

}
