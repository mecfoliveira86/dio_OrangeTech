package exercices;
/*Calcule um o valor de um número fatorial*/

import java.util.Scanner;

public class Exercice06 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o número que deseja calcular o fatorial: ");
		int numero = sc.nextInt();
		int resultado = 1;
		if (numero < 1) {
			System.out.println("Valor do fatorial do número escolhido é 1.");
		} else {
			while (numero > 1) {
				resultado *= numero;
				numero--;
			}
			System.out.println("Valor do fatorial do número escolhido é " + resultado + ".");
		}
	}

}
