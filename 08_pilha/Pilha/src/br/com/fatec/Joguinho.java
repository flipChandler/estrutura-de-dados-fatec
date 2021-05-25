package br.com.fatec;

import java.util.Random;

public class Joguinho {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		Random random = new Random();
		
		do {
			if (random.nextInt(2) == 0) { // random entre 0 e 1
				if (!pilha.estaVazia()) {
					System.out.println(pilha.pull() + " foi desempilhado");
				}
			} else {
				if (!pilha.estaCheia()) {
					pilha.push(random.nextInt(10));
				}
			}
			System.out.println(pilha);
		} while (!pilha.estaVazia());
		
	}

}
