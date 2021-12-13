package br.com.estrutura.listaencadeada;

public class No<T> {
	
	private T conteudo;
	private No proximoNo;
	
	public No() {
		this.proximoNo = null;
	}

	public No(T conteudo) {
		super();
		this.conteudo = conteudo;
	}
	
	public No(T conteudo, No proximoNo) {
		super();
		this.conteudo = conteudo;
		this.proximoNo = proximoNo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}	
		
	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}

	public String toStringEncadeado() { 
		String msg = "No [conteudo=" + conteudo + "]";
		
		if (proximoNo != null) {
			msg += "-> " + this.proximoNo.toString();
		} else {
			msg += "-> null";
		}
		return msg;
	}
}
