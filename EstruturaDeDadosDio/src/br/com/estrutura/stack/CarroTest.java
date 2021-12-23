package br.com.estrutura.stack;

import java.util.Stack;

public class CarroTest {

	public static void main(String[] args) {
		
		Stack<Carro> pilha = new Stack<>();
		
		pilha.push(new Carro("Ford"));
		pilha.push(new Carro("Ferrari"));
		pilha.push(new Carro("Volks"));
		pilha.push(new Carro("Mercedes"));
		pilha.push(new Carro("Honda"));
		
		System.out.println(pilha);
		System.out.println(pilha.pop()); // Honda
		System.out.println(pilha);
		System.out.println(pilha.peek()); // Mercedes
		System.out.println(pilha);
		System.out.println(pilha.empty()); // false
	}

}
