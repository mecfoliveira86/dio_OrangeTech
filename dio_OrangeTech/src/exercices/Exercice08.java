package exercices;

import java.util.Scanner;

/*Faça um programa que leia um vetor de 6 caracteres
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes 
 * */

public class Exercice08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] letras = new String [6];
		int consoantesLidas = 0;
		
		int counter = 0;
		
		do {
			System.out.println("Digite sua letra a ser analisada:");
			String letra = sc.next();
			if(!(letra.equalsIgnoreCase("a") || 
				letra.equalsIgnoreCase("e") ||
				letra.equalsIgnoreCase("i") ||
				letra.equalsIgnoreCase("o") ||
				letra.equalsIgnoreCase("u")) ) {
				consoantesLidas ++;
				letras[counter] = letra;
			}
			counter ++;
		} while(counter < 6);
		
		System.out.println("Letras inseridas que são consoantes:");
		for(String letra : letras) {
			if(letra != null) {				
				System.out.print(letra + " ");
			}
		}
	
	}

}
