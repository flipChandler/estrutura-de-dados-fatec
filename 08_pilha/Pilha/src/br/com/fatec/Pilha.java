package br.com.fatec;

public class Pilha {
	
	private int[] dados;
	private int topo;
	private int capacidade;
	
	public Pilha() {
		this(10);
	}
	
	public Pilha(int capacidade) {
		setDados(new int[capacidade]);
		setTopo(0);
		setCapacidade(capacidade);
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
	

	@Override
	public String toString() {
		String msg = "Pilha: ";
		if (this.estaVazia()) {
			msg += "está vazia";
		} else {
			msg = msg + "Capacidade: " + this.capacidade + " Tamanho: " + this.tamanho() + "\n";
			for (int i = this.topo - 1; i >= 0; i--) {
				msg += this.dados[i] + " ";
			}
		}
		msg += "\n";
		return msg;
	}

	public int[] getDados() {
		return dados;
	}

	public void setDados(int[] dados) {
		this.dados = dados;
	}

	public int getTopo() {
		return topo;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	
}
