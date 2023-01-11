package flowManagement;

import java.util.Locale;
import java.util.Scanner;

public class Flow02 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
		System.out.println("Digite um número ordinal da semana: ");
		int day = sc.nextInt();
		
		switch(day) {
			case 1:
			case 2:
			case 3:
				System.out.println("Certo");
				break;
			case 4:
				System.out.println("Errado");
				break;
			case 5:
				System.out.println("Talvez");
				break;
			default:
				System.out.println("Valor indefinido");
				break;
				
		}
	}

}
