package exercices;

public class RodarHierarquia {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		//Upcast Example: It is a good mood to use
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
		//Downcast Example- Avoid to use
		//Vendedor vendedor2 = new Funcionario();
		Gerente gerente2 = (Gerente) new Funcionario();
	}

}
