package br.com.estrutura.list;

import java.util.ArrayList;
import java.util.List;

public class CarroTest {

	public static void main(String[] args) {
		
		List<Carro> lista = new ArrayList<>();
		
		lista.add(new Carro("Mercedes"));
		lista.add(new Carro("Chevrolet"));
		lista.add(new Carro("Honda"));
		lista.add(new Carro("Nissan"));
		lista.add(new Carro("Toyota"));
		
		System.out.println(lista.contains(new Carro("Nissan"))); // true
		
		System.out.println(lista.get(2));
		
		System.out.println(lista.indexOf(new Carro("Nissan"))); // 3
		
		System.out.println(lista.remove(3)); // Nissan
		System.out.println(lista);
	}

}
