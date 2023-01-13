package exercices;

import java.util.Scanner;

/*Crie um vetor de 6 números inteiros e mostre-os em ordem inversa
 * */
public class Exercices07 {
	public static void main(String [] args) {		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = {0,0,0,0,0,0};
		
		for(int i = 0; i<numeros.length; i++) {
			System.out.println("Insira o " + (i + 1) + "° número:");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Os números inseridos em ordem inversa: ");
		
		for(int j = numeros.length - 1; j >= 0; j--) {
			System.out.print(numeros[j] + " ");
		}
		
	}
	

}
