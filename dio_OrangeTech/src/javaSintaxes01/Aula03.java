package javaSintaxes01;

public class Aula03 {
	public static void main(String[] args) {
		//criacao de variavel em esta estrutura:
		//tipo nomeVariavel = valor;
		
		String meuNome = "Felipe";
		String sobrenome = "Oliveira";
		int anoFabricacao = 2022;
		boolean verdadeira = true;
		
		String nomeCompleto = nomeCompleto(meuNome, sobrenome);
		
		System.out.println(nomeCompleto);
		
	}
	
	//declaracao de métodos:
	//tipoRetorno nomeMetodo
	//Metodos são definidos fora da classe.
	
	public static String nomeCompleto(String nome, String sobrenome) {
		return nome.concat(" ").concat(sobrenome);
	}
			
}
