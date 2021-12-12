package br.com.estrutura.fila;

public class FilaTest {

	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.enqueue(new No("primeiro"));
		fila.enqueue(new No("segundo"));
		fila.enqueue(new No("terceiro"));
		fila.enqueue(new No("quarto"));
		fila.enqueue(new No("quinto"));
		
		System.out.println(fila);
		
		fila.enqueue(new No("sexto"));
		System.out.println(fila);
		
		System.out.println(fila.dequeue());
		System.out.println(fila);
		
		System.out.println(fila.first());
		
		
	}

}
