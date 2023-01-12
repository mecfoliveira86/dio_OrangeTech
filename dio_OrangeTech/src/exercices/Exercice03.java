package exercices;

import java.util.Scanner;

public class Exercice03 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int counter = 0;
		int maior = 0;
		double resultado = 0;
		while(counter < 5) {
			System.out.println("Insira um número:");
			numero = sc.nextInt();
			
			if(numero > maior) {
				maior = numero;
			}
			
			resultado += numero;
			counter++;
		}
		
		System.out.println("A média dos números informados é: " + resultado / 5);
		System.out.println("O maior valor é " + maior);
		
	}

}
