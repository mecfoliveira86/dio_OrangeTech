package sintaxes_01;

public class Aula04 {
	//falando sobre identacao e o comando if
	public static void main(String[] args) {
		int nota1 = 7;
		int nota2 = 5;
		double media = (nota1 + nota2) / 2;
		
		if(media < 6) {
			System.out.println("REPROVADO");
		} else if (media == 6) {
			System.out.println("PROVA MINERVA");
		} else {
			System.out.println("APROVADO");
		}
	}
	

}
