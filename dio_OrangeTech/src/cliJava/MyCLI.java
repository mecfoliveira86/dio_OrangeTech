package cliJava;

public class MyCLI {
	public static void main(String args[]) {
		
		int valor1 = Integer.valueOf(args[0]);
		double valor2 = Double.valueOf(args[1]);
		double result = valor1 + valor2;
		
		System.out.println("O resultado da soma é " + result);
	}

}
