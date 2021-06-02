package br.com.fatec;

import java.util.Random;

public class NovoTesteFila {

	public static void main(String[] args) {
		Fila fila = new Fila(8);
		Random random = new Random();
		do {
			if (random.nextInt(2) == 0) {
				if (!fila.estaCheia()) {
					fila.insere(random.nextInt(10));
				}
			} else {
				if (!fila.estaVazia()) {
					System.out.println(fila.remove() + " foi removido");
				}
			}
			System.out.println(fila.mostraVetor() + " | " + fila);
		}while(!fila.estaVazia());
	}

}
