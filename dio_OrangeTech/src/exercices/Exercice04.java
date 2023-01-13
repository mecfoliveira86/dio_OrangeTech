package exercices;

import java.util.Scanner;

/*Crie um algoritmo que:
 * a-Solicite ao usuário o número de algarismos inteiros que ele deseja que sejam classificados entre pares e ímpares
 * b-Exiba em tela o número de algarismos pares e ímpares. 
 * */

public class Exercice04 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int numerosAnalisar = 0;
		int pares = 0;
		int impares = 0;
		
		System.out.println("Insira o número de algarismos que deseja classificar");
		numerosAnalisar = sc.nextInt();
		
		while(numerosAnalisar != 0) {
			System.out.println("Informe um número que deseja analisar: ");
			int numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			
			numerosAnalisar--;
		}
		
		System.out.println("Quantidade de números pares: " + pares);
		System.out.println("Quantidade de números ímpares: " + impares);
		
	}

}
