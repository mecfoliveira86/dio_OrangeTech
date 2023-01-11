package cliJava;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
		System.out.println("Insira seu nome");
		String nome = sc.next();

		System.out.println("Insira sua idade");
		int idade = sc.nextInt();
		
		System.out.println("Insira sua altura");
		double altura = sc.nextDouble();
		
		System.out.println("Insira seu peso");
		double peso = sc.nextDouble();
		
		
		double IMC = peso / (altura * altura);
		
		System.out.println(nome + ", seu IMC é " + IMC);
	}

}