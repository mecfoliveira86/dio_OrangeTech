package exercices;

import java.util.Scanner;

/*Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome de um aluno e o segundo representando a sua idade.
 * (pare inserindo o valor 0 no campo).
 * */
public class Exercice02 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int nota;
		
		while(true) {
			System.out.println("Insira uma nota entre 0 e 10:");
			nota = sc.nextInt();
			
			if(nota >= 0 && nota <= 10){
				break;
			} else {
				System.out.println("Nota inválida!");
			}
		}
		sc.close();
	}

}
