package br.com.estrutura.fila;

public class FilaTest {

	public static void main(String[] args) {
		Fila<String> fila = new Fila<>();
		fila.enqueue("primeiro");
		fila.enqueue("segundo");
		fila.enqueue("terceiro");
		fila.enqueue("quarto");
		fila.enqueue("quinto");
		
		System.out.println(fila);
		
		fila.enqueue("sexto");
		System.out.println(fila);
		
		System.out.println(fila.dequeue());
		System.out.println(fila);
		
		System.out.println(fila.first());		
	}

}
