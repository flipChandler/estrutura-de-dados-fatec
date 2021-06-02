package br.com.fatec;

public class TesteFila {

	public static void main(String[] args) {
		// QLQ NUMERO % POR UM NÚMERO MAIOR, O RESTO SERÁ ELE MESMO 
		System.out.println(5 % 100); // 5
		System.out.println(6 % 7); // 6
		
		
		Fila fila = new Fila();
		System.out.println(fila);
		
		int i = 1;
		
		while (!fila.estaCheia()) {
			fila.insere(i++);
			System.out.println(fila);
		}
		
		while (!fila.estaVazia()) {
			System.out.println(fila.remove() + " foi removido");
			System.out.println(fila);
		}
	}

}
