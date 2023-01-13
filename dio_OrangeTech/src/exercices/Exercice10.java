package exercices;

import java.util.Random;

/*Gere e imprima uma matriz de ordem 4 x 4 com valores aleatórios entre 0 e 9*/

public class Exercice10 {
	public static void main(String [] args) {
		Random rd = new Random();
		
		int[][] valores = new int[4][4];
		
		for(int i = 0; i < valores.length; i++) {
			for(int j = 0; j < valores[i].length; j++) {
				valores[i][j] = rd.nextInt(9);
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
