package sintaxes_01;

public class Aula02 {
	public static void main(String [] args) {
		int numero = 123456789;
		int numeroDeSerie = 5467;
		final String texto = "Brasil";
		//texto = "Outro país";
		
		//A variável texto não pode ser alterada em função da linha 7 ter a palavra reservada **final**.
		System.out.println("Número é igual a "  + numero);
		System.out.println("Número de série é igual a " + numeroDeSerie);
	}
}
