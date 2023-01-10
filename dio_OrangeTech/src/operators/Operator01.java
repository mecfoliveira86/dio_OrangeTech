package operators;

public class Operator01 {
	
	public static void main(String [] args) {
		//soma aritmética
		double soma = 10.3 + 25.7;

		//subtração aritmética
		double subtracao = 7.6 - 9.8;
		
		//multiplicação aritmética
		int multiplicacao = 20*7;
		
		//divisão aritmética
		double divisao = 7 / 2;
		
		//módulo (resto de uma divisão)
		int modulo = 18 / 5;
		
		//expressão aritmética
		double resultado = (10 * 7) / (20 / 4);
		
		//operação textual
		String testeTexto = "Teste " + "texto em Java";
		
		System.out.println(testeTexto);
		
		boolean var = true;
		
		var = !var;
		
		System.out.println(var);
		
		String ternario = 2 == 5 ? "Afirmação Verdadeira" : "Afirmação Falsa";
		System.out.println(ternario);
		
		//Operadores relacionais
		
		//Igualdade
		boolean equal = 2 == 2;
		
		//Diferente
		boolean difference = 2 != 2;
		
		//Maior
		boolean major = 2 > 2;
		
		//Maior ou igual
		boolean majorOrEqual = 2 >= 2;
		
		//Menor
		boolean minor = 2 < 2;
		
		//Menor ou igual
		boolean minorOrEqual = 2 <= 2;
		
		//Relação de textos
		String nomeUm = "Felipe";
		String nomeDois = "Felipe";
		
		boolean textCompare = nomeUm.equals(nomeDois);
		
		
	}

}
