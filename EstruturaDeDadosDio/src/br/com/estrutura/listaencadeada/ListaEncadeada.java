package br.com.estrutura.listaencadeada;

public class ListaEncadeada<T> {
	
	private No<T> referenciaEntrada;

	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if (this.isEmpty()) {
			this.referenciaEntrada = novoNo;
			return;
		}
		
		No<T> noAux = this.referenciaEntrada;
		for (int i = 0; i < this.size() - 1; i++) {
			noAux = noAux.getProximoNo();
		}
		noAux.setProximoNo(novoNo); 
	}
	
	public int size() {
		int tamanhoLista = 0;
		No<T> refereciaAux = this.referenciaEntrada;
		while (true) {
			if (refereciaAux != null) {
				tamanhoLista++;
				if (refereciaAux.getProximoNo() != null) {
					refereciaAux = refereciaAux.getProximoNo();
				} else {
					break;
				}
			} else {
				break;
			}
		}
		return tamanhoLista;
	}	
	
	public boolean isEmpty() {
		return this.referenciaEntrada == null ? true : false;
	}
	
	public T remove(int index) {  // remover o nó 3 (pivot)
		No<T> noPivot = this.getNo(index);
		if (index == 0) {
			this.referenciaEntrada = noPivot.getProximoNo(); // se index == 0, a entrada será o indice 1
			return noPivot.getConteudo();
		}
		
		No<T> noAnterior = this.getNo(index - 1); // noAnterior == 2 
		noAnterior.setProximoNo(noPivot.getProximoNo()); // o proximo do noAnterior (2) será o proximo do 3 (4)
		return noPivot.getConteudo();
	}
	
	public T get (int index) {
		return getNo(index).getConteudo();
	}
	
	private No<T> getNo(int index) {		
		validaIndice(index);		
		No<T> noAux = this.referenciaEntrada;
		No<T> noRetorno = null;
		
		for (int i = 0; i < index + 1; i++) {
			noRetorno = noAux;
			noAux = noAux.getProximoNo();
		}
		return noRetorno;		
	}
	
	private void validaIndice(int index) {
		if (index >= size()) {
			int ultimoIndice = size() - 1;
			throw new IndexOutOfBoundsException("Não existe conteúdo no índice: " + index 
					+ "\nEsta lista só vai até o índice: " + ultimoIndice);
		}
	}

	@Override
	public String toString() {
		String msg = "";
		No<T> noAux = this.referenciaEntrada;
		for (int i = 0; i < this.size(); i++) {
			msg += "[No { conteúdo = " + noAux.getConteudo() + "}]-->";
			noAux = noAux.getProximoNo();
		}
		msg += "null";
		return msg;
	}	
}
