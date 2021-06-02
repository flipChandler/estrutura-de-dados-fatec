package br.com.fatec;

public class Fila {
	
	private int[] dados;
	private int primeiro;
	private int ultimo;
	private int quantidade;
	private int capacidade;
	
	public Fila() {
		this(6); // está chamando o construtor que tem capacidade
	}
	
	public Fila (int capacidade) {
		this.dados = new int[6];
		this.capacidade = 6;
		this.primeiro = 0;
		this.ultimo = 0;
		this.quantidade = 0;
	}
	
	public boolean estaVazia() {
		return this.quantidade == 0;
	}
	
	public boolean estaCheia() {
		return this.quantidade == this.capacidade;
	}
	
	private int proxima (int posicao) {
		return (posicao + 1) % this.capacidade;
	}
	
	private int anterior (int posicao) {
		return (posicao - 1 + this.capacidade) % this.capacidade; // (4 - 1 + 5) % 5 = 3 | emprestou, paga
	}
	
	
	public void insere (int dado) {
		this.dados[this.ultimo] = dado;
		this.ultimo = proxima(this.ultimo);
		this.quantidade++;
	}
	
	public int remove() {
		int removido = this.dados[this.primeiro];
		this.primeiro = proxima(this.primeiro); // por isso a fila gira | (5 + 1) % 6 = 0 
		this.quantidade--;		
		return removido;
	}
	
	public int primeiro() {
		return this.dados[this.primeiro];
	}
	
	public int tamanho() {
		return this.quantidade;
	}
	
	public int ultimo() {
		return this.dados[anterior(this.ultimo())];
	}
	
	@Override
	public String toString () {
		String msg = "fila: ";
		if (this.estaVazia()) {
			msg += "vazia";
		} else {
			int i = this.primeiro;
			do {
				msg += this.dados[i] + " ";
				i = proxima(i);
			} while (i != this.ultimo); // quando i for igual ao ultimo, sai do loop
		}
		return msg;
	}
	
	public String mostraVetor() {
		int i;
		String msg = "";
		if (this.estaVazia()) {
			for (i = 0; i < this.capacidade; i++) {
				msg += "_ ";
			}
		} else if (this.estaCheia()) {
			for (i = 0; i < this.capacidade; i++) {
				msg += this.dados[i] + " ";
			}
		} else if (this.primeiro < this.ultimo) {
			for (i = 0; i < this.primeiro; i++) {
				msg += "_ ";
			}
			for (i = this.primeiro; i < this.ultimo; i++) {
				msg += this.dados[i] + " ";
			}
			for (i = this.ultimo; i < this.capacidade; i++) {
				msg += "_ ";
			}
		} else {
			for (i = 0; i < this.ultimo; i++) {
				msg += this.dados[i] + " ";
			}
			for (i = this.ultimo; i < this.primeiro; i++) {
				msg += "_ ";
			}
			for (i = this.primeiro; i < this.capacidade; i++) {
				msg += this.dados[i] + " ";
			}
		}
		
		return msg;
	}
	
	
}
