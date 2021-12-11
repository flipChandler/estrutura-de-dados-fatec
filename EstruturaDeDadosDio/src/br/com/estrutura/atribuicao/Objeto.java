package br.com.estrutura.atribuicao;

public class Objeto {
	
	Integer numero;
	
	public Objeto(Integer numero) {
		this.numero = numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return this.numero.toString();
	}

}
