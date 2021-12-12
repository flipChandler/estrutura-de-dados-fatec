package br.com.estrutura.fila;

public class No {
	
	private Object object;
	private No referenciaNo;
	
	public No() {
		
	}
	
	public No(Object object) {
		this.object = object;				
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public No getReferenciaNo() {
		return referenciaNo;
	}

	public void setReferenciaNo(No referenciaNo) {
		this.referenciaNo = referenciaNo;
	}

	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}		
}
