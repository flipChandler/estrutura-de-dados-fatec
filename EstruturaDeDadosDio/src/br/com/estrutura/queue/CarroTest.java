package br.com.estrutura.queue;

import java.util.LinkedList;
import java.util.Queue;

public class CarroTest {

	public static void main(String[] args) {
		
		Queue<Carro> fila = new LinkedList<>();
		
		fila.add(new Carro("Volks"));
		fila.add(new Carro("Hyundai"));
		fila.add(new Carro("Ferrari"));
		fila.add(new Carro("Peugeot"));
		fila.add(new Carro("Mercedes"));
		fila.add(new Carro("Suzuki"));
		
		System.out.println(fila.add(new Carro("Toyota"))); // true
		System.out.println(fila);
		
		System.out.println(fila.offer(new Carro("Honda"))); // true
		
		System.out.println(fila.peek()); // display o 1º da fila e não remove
		System.out.println(fila);
		System.out.println(fila.poll()); // display o 1º da fila e remove
		System.out.println(fila);
		
		System.out.println(fila.isEmpty()); // false
		System.out.println(fila.size()); // 7
	}

}
