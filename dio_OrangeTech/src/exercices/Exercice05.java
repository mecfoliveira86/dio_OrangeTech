package exercices;

import java.util.Scanner;

/*Crie um algoritmo para calcular a tabuada de um número a ser informado pelo usuário
 * */
public class Exercice05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número para ser calculada a tabuada: ");
		int escolha = sc.nextInt();
		
		System.out.println("Tabuada de " + escolha + ":");
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(escolha + " x " + i + " = " + escolha * i);
		}
	}

}
