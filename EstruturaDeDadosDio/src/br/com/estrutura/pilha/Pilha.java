package br.com.estrutura.pilha;

public class Pilha {
	
	private No noEntradaPilha;
	
	public Pilha() {
		this.noEntradaPilha = null;
	}
	
	public void push(No novoNo) {
		No aux = this.noEntradaPilha;
		this.noEntradaPilha = novoNo;
		this.noEntradaPilha.setReferenciaNo(aux);
	}
	
	public No pop() {
		if (!this.isEmpty()) {
			No popedNo = this.noEntradaPilha;
			this.noEntradaPilha = this.noEntradaPilha.getReferenciaNo();
			return popedNo;
		}
		return null;
	}
	
	public No top() {
		 return this.noEntradaPilha;
	}
	
	public boolean isEmpty() {
		return this.noEntradaPilha == null ? true : false;
	}
	
	@Override
	public String toString() {
		String msg = "---------------------\n";
		msg += "      Pilha\n";
		msg += "---------------------------\n";
		
		No aux = this.noEntradaPilha;
		while(true) {
			if (aux != null) {
				msg += "[No{dado = " + aux.getDado() + "}]\n";
				aux = aux.getReferenciaNo();
			} else {
				break;
			}
		}
		msg += "-------------------\n";
		return msg;
	}
}
