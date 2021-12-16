package br.com.estrutura.arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {
	
	private BinNo<T> raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	public void inserir(T conteudo) {
		BinNo<T> novoNo = new BinNo<>(conteudo);
		this.raiz = inserir(this.raiz, novoNo);
	}

	private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
		if (atual == null) { // se atual for igual a nulo, seta a raiz
			return novoNo;
		} else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
			atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
		} else {
			atual.setNoDir(inserir(atual.getNoDir(), novoNo));
		}
		return atual;
	}
}
