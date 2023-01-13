package exercices;
/*Faça um programa que leia 20 números aleatórios que variem entre 0 e 100.
 * Armazene-os em um vetor. Ao final mostre os números e seus sucessores.
 *  **/

import java.util.Random;

public class Exercice09 {
	
	public static void main(String [] args) {
		Random rd = new Random();
		int[] valores = new int[20];
		
		for(int i = 0; i < 20; i++) {
			valores[i] = rd.nextInt(100);
			System.out.println("Linha " + (i + 1) + " | Número sorteado: " + valores[i] + " | " + "Número sucessor: " + (valores[i] + 1) );
		}
		
	}

}
