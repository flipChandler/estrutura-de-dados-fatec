package br.com.fatec;

public class PilhaGenerica<T> {
	
	private T[] dados;
	private int capacidade;
	private int topo;
	
	public PilhaGenerica () {
		this(10);
	}
	
	@SuppressWarnings("unchecked")
	public PilhaGenerica (int capacidade) {
		this.dados = (T[]) new Object[capacidade];
		this.topo = 0;
		this.capacidade = capacidade;
	}
	
	public boolean estaCheia() {
		return this.topo == this.capacidade;
	}
	
	public boolean estaVazia() {
		return this.topo == 0;
	}
	
	public void push(T dado) {
		this.dados[this.topo++] = dado;
	}
	
	public T pull() {
		return this.dados[--this.topo];
	}
	
	public int tamanho() {
		return this.topo;
	}
	
	public T consultaTopo() {
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
}
