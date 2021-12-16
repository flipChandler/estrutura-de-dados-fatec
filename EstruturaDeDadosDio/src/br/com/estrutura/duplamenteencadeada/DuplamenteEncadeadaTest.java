package br.com.estrutura.duplamenteencadeada;

public class DuplamenteEncadeadaTest {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();
		
		lista.add("c1");
		lista.add("c2");
		lista.add("c3");
		lista.add("c4");
		lista.add("c5");
		lista.add("c6");
		lista.add("c7");
		lista.add("c8");
		lista.add("c9");
		
		System.out.println(lista);
		lista.remove(1);
		lista.add(4, "new c");
		
		System.out.println(lista);
		
		System.out.println(lista.get(4));
	}

}
