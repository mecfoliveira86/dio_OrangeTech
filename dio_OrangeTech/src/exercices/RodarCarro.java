package exercices;

public class RodarCarro {
	public static void main(String [] args) {
		Carro car1 = new Carro("Amarelo", "Carro1", 60);
		
		System.out.println("Cor do Carro: " + car1.getCor());
		System.out.println("Nome do modelo: " + car1.getModelo());
		System.out.println("Capacidade tanque: " + car1.getCapacidadeTanque());
		System.out.println("Valor para encher o tanque: " + car1.calcularValorTanque(2.50));
		
		Carro car2 = new Carro();
		car2.setCor("Cinza");
		car2.setModelo("Mercedez");
		car2.setCapacidadeTanque(70);
		
		System.out.println("----***----");		
		System.out.println("Cor do Carro: " + car2.getCor());
		System.out.println("Nome do modelo: " + car2.getModelo());
		System.out.println("Capacidade tanque: " + car2.getCapacidadeTanque());
		System.out.println("Valor para encher o tanque: " + car2.calcularValorTanque(3));
		
	}
}
