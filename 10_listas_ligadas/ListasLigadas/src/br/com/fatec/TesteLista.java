package br.com.fatec;

public class TesteLista {

	public static void main(String[] args) {
		ListaLigada ll = new ListaLigada();
		
		ll.insereInicio(10);
		ll.insereInicio(20);
		ll.insereInicio(30);
		ll.insereInicio(17);
		
		System.out.println(ll);
		
		if (!ll.listaVazia()) {
			System.out.println(ll.removeInicio() + " foi removido do inicio");
			System.out.println(ll);
		}
		
		

	}

}
