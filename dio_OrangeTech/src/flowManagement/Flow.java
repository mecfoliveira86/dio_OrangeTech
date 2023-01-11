package flowManagement;

import java.util.Scanner;
import java.util.Locale;

public class Flow {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
		System.out.println("Insira um número de Mês para análise: ");
		int month = sc.nextInt();
		
		switch(month) {
			case 1: 
				System.out.println("Janeiro");
				break;
			case 2: 
				System.out.println("Fevereiro");
				break;
			case 3: 
				System.out.println("Março");
				break;
			case 4: 
				System.out.println("Abril");
				break;
			case 5: 
				System.out.println("Maio");
				break;
			case 6: 
				System.out.println("Junho");
				break;
			case 7: 
				System.out.println("Julho");
				break;
			case 8: 
				System.out.println("Agosto");
				break;
			case 9: 
				System.out.println("Setembro");
				break;
			case 10: 
				System.out.println("Outubro");
				break;
			case 11: 
				System.out.println("Novembro");
				break;
			case 12: 
				System.out.println("Dezembro");
				break;
			default:
				System.out.println("Mês não reconhecido");
				break;			
		}
		
		boolean vacation = (month == 1 || month == 7) || month == 12;
		
		if(vacation) {
			System.out.println("Férias");
		}
	}
}
