package br.com.fatec;

public class Programa {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		// Teste - Exercício 01-a)
		pilha.empilhaForte(7);
		pilha.empilhaForte(5);
		pilha.empilhaForte(4);
		pilha.empilhaForte(3);		
		System.out.println(pilha.consultaTopo());
		System.out.println(pilha.tamanho());
		
		System.out.println(pilha);
		
		
		// Teste - Exercício 1-b)
		pilha.desempilhaDeBaixo();
		System.out.println(pilha);
		
		
		pilha.empilhaForte(2);
		pilha.empilhaForte(1);
		pilha.empilhaForte(-1);
		System.out.println(pilha);
		
		

		pilha.desempilhaDeBaixo();
		System.out.println(pilha);
		System.out.println(pilha.consultaTopo());
		
		
		// Teste - Exercício 2
		Pilha pilhaBinario = new Pilha(10);
		pilhaBinario.converteBinario(16);
		System.out.println(pilhaBinario);
		
	}

}
