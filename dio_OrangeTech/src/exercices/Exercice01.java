package exercices;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre 10 e 0.
 * Mostre uma mensagem se o valor informado for inválido e continue pedindo
 * até que o usuário insira um valor válido.
 * */
public class Exercice01 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
				
		while(flag) {
			System.out.println("Digite o nome do aluno: ");
			String nome = sc.next();
			if (nome.equals("0")) {
				flag = false;
				break;
			} else {
				System.out.println("Digite a idade do aluno: ");
				int idade = sc.nextInt();
			}
		}
		System.out.println("Finalizado!");
		sc.close();
	}
}
