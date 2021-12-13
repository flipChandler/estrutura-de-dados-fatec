package br.com.estrutura.listaencadeada;

public class ListaEncadeadaTest {

	public static void main(String[] args) {
		
		ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();
		
		listaEncadeada.add("teste1");
		listaEncadeada.add("teste2");
		listaEncadeada.add("teste3");
		listaEncadeada.add("teste4");
		listaEncadeada.add("teste5");
		listaEncadeada.add("teste6");
		
		System.out.println(listaEncadeada.get(0));
		System.out.println(listaEncadeada.get(1));
		System.out.println(listaEncadeada.get(2));
		System.out.println(listaEncadeada.get(3));
		System.out.println(listaEncadeada.get(4));
		System.out.println(listaEncadeada.get(5));
		
		System.out.println(listaEncadeada);
		
		System.out.println(listaEncadeada.remove(3));
		
		System.out.println(listaEncadeada);
	}

}
