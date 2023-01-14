package exercices;

public class Carro {
	
	String cor;
	String modelo;
	int capacidadeTanque;
	
	Carro(){}
	
	Carro(String cor, String modelo, int capacidadeTanque){
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	
	double calcularValorTanque(double valorCombustivel) {
		return valorCombustivel * capacidadeTanque;
	}

}
