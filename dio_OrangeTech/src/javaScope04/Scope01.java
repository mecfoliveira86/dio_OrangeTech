package javaScope04;


public class Scope01 {
	//Scope is a subject aligned to variable access inside Classes or methods.
	
	int valorNumeral = 9880;
	
	public void calcularNumero(int numero) {
		if (numero > valorNumeral) {
			valorNumeral++;
		} else {
			valorNumeral--;
		}
		
		//the variable numero is not able to be used outside of calcularNumero method.
	}

}
