package br.com.fatec;

public class Pilha {

	private int[] dados;
	private int topo;
	private int capacidade;

	public Pilha() {
		this(10);
	}

	public Pilha(int capacidade) {
		this.dados = new int[capacidade];
		this.topo = 0;
		this.capacidade = capacidade;
	}

	public boolean estaCheia() {
		return this.topo == this.capacidade;
	}

	public boolean estaVazia() {
		return this.topo == 0;
	}

	public void push(int dado) {
		this.dados[this.topo++] = dado;
	}

	public int pull() {
		return this.dados[--this.topo];
	}

	public int tamanho() {
		return this.topo;
	}

	public int consultaTopo() {
		return this.dados[this.topo - 1];
	}

	
	// Exerc�cio 01- a)
	public void empilhaForte(int dado) {
		if (estaVazia()) {
			push(dado);
		} else if (dado <= consultaTopo()) {
			push(dado);
		} else {
			System.out.println("Pilha Fraca! N�o � poss�vel empilhar n�mero maior que o anterior!");
		}
	}

	// Exerc�cio 1-b)
	public void desempilhaDeBaixo() {
		if (tamanho() > 1) {
			this.dados[this.topo - 2] = this.dados[this.topo - 1];
			this.topo--;
		} else {
			System.out.println("S� pode desempilhar a partir de 2 cartas!");
		}
	}
	
	// Exerc�cio 2
	public void converteBinario(int num) {
		while (num > 2) { 
			push(num % 2);
			num = num / 2;
		}
		push(num % 2); 
		push(num / 2); 

	}

	@Override
	public String toString() {
		String msg = "Pilha: ";
		if (this.estaVazia()) {
			msg += "est� vazia";
		} else {
			msg = msg + "Capacidade: " + this.capacidade + " Tamanho: " + this.tamanho() + "\n";
			for (int i = this.topo - 1; i >= 0; i--) {
				msg += this.dados[i] + " ";
			}
		}
		msg += "\n";
		return msg;
	}

	public void setDados(int[] dados) {
		this.dados = dados;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
