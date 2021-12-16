package br.com.estrutura.listacircular;

public class ListaCircular<T> {
	
	private No<T> cabeca;
	private No<T> cauda;
	private int tamanhoLista;
	
	public ListaCircular() {
		this.cauda = null;
		this.cabeca = null;
		this.tamanhoLista = 0;
	}
	
	public boolean isEmpty() {
		return this.tamanhoLista == 0 ? true : false;
	}
	
	public int size() {
		return this.tamanhoLista;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if (this.tamanhoLista == 0) {
			this.cabeca = novoNo;
			this.cauda = this.cabeca;
			this.cabeca.setNoProximo(this.cauda);
		} else {
			novoNo.setNoProximo(this.cauda);
			this.cabeca.setNoProximo(novoNo);
			this.cauda = novoNo;
		}
		this.tamanhoLista++;
	}
	
	// o indice 0 é a cauda que está ligada com a cabeça
	public void remove(int index) {
		if (index >= this.tamanhoLista) throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista!");
		No<T> noAux = this.cauda;
		if (index == 0) {
			this.cauda = this.cauda.getNoProximo();
			this.cabeca.setNoProximo(this.cauda);
		} else if (index == 1) {
			this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo()); // seta o proximo do proximo no proximo de this.cauda
		} else {
			for (int i = 0; i < index - 1; i++) { // vai até o indice n - 1 (1 antes do indice a ser excluído) 
				noAux = noAux.getNoProximo();
			}
			noAux.setNoProximo(noAux.getNoProximo().getNoProximo()); // seta o proximo do 'indice n - 1' no proximo do 'indice excluido' (pula o indice excluído) 
		}
		this.tamanhoLista--;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	@Override
	public String toString() {
		String msg = ""; 
		
		No<T> noAux = this.cauda;
		for (int i = 0; i < this.size(); i++) {
			msg += "[No{conteudo = " + noAux.getConteudo() + "}] --> ";
			noAux = noAux.getNoProximo();
		}
		
		msg += this.isEmpty() ? "[]" : "(Retorna ao início)";
		
		return msg;
	}
	
	private No<T> getNo(int index) {
		if (this.isEmpty()) throw new IndexOutOfBoundsException("A lista está vazia!");
		
		if (index == 0) {
			return this.cauda;
		}
		
		No<T> noAux = this.cauda;
		for (int i = 0; (i < index) && (noAux != null); i++) {
			noAux = noAux.getNoProximo();
		}
		return noAux;
	}
}
