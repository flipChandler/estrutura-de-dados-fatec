package br.com.estrutura.fila;

public class Fila {
	
	 private No noEntradaFila;
	 
	 public Fila() {
		 this.noEntradaFila = null;
	 }
	 
	 public void enqueue (Object obj) {
		 No novoNo = new No(obj); 
		 novoNo.setReferenciaNo(this.noEntradaFila);
		 this.noEntradaFila = novoNo;
	 }
	 
	 public Object dequeue () {
		 if (!this.isEmpty()) {
			No primeiroNo = this.noEntradaFila;
			No aux = null;
			while(true) {
				if (primeiroNo.getReferenciaNo() != null) {  
					aux = primeiroNo;
					primeiroNo = primeiroNo.getReferenciaNo(); 
				} else {
					aux.setReferenciaNo(null);
					break; 
				}
			}
			return primeiroNo.getObject();
		 }
		 return null;
	 }
	 
	 public Object first () {
		 if (!this.isEmpty()) {
			No primeiroNo = this.noEntradaFila;   // é o último 
			while(true) {
				if (primeiroNo.getReferenciaNo() != null) {  // se o ultimo tiver uma referencia na frente
					primeiroNo = primeiroNo.getReferenciaNo(); // primeiroNo passa a ser essa referencia
				} else {
					break; // até não ter referencia na frente
				}
			}
			return primeiroNo.getObject();
		 }
		 return null;
	 }
	 
	 public boolean isEmpty() {
		 return this.noEntradaFila == null ? true : false;
	 }
	 
	 @Override
	 public String toString() {
		String msg = "";
		No aux = this.noEntradaFila;
		
		if (this.noEntradaFila != null) {
			while (true) {
				msg += "[No { objeto = " + aux.getObject() + " }]--->";
				if (aux.getReferenciaNo() != null) {
					aux = aux.getReferenciaNo();
				} else {
					msg += "null";
					break;
				}
			}
		} else {
			msg = "null";
		}
		
		return msg;
	 }
}
