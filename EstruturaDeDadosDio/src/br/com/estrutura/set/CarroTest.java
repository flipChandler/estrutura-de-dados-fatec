package br.com.estrutura.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CarroTest {

	public static void main(String[] args) {
		
		Set<Carro> hashSet = new HashSet<>();
		
		hashSet.add(new Carro("Mercedes"));
		hashSet.add(new Carro("Chevrolet"));
		hashSet.add(new Carro("Honda"));
		hashSet.add(new Carro("Nissan"));
		hashSet.add(new Carro("Toyota"));
		
		System.out.println(hashSet);
		System.out.println(hashSet.contains(new Carro("Nissan"))); // true
		System.out.println(hashSet.remove(3)); // Nissan
		System.out.println(hashSet);
		
		Set<Carro> treeSet = new TreeSet<>();
		treeSet.add(new Carro("Mercedes"));
		treeSet.add(new Carro("Chevrolet"));
		treeSet.add(new Carro("Honda"));
		treeSet.add(new Carro("Nissan"));
		treeSet.add(new Carro("Toyota"));
		
		System.out.println(treeSet); // adicionou os carros conforme o tamanho da string ou por ordem alfabetica(compareTo())
		
	}

}
