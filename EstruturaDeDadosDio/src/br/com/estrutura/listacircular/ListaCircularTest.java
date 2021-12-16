package br.com.estrutura.listacircular;

public class ListaCircularTest {

	public static void main(String[] args) {
		ListaCircular<String> lista = new ListaCircular<>();
		
		lista.add("c0");
		lista.add("c1");
		lista.add("c2");
		lista.add("c3");
		
		System.out.println(lista);
		lista.remove(0);
		System.out.println(lista);
		System.out.println("get" + lista.get(2));
		
		// LOOP PARA VERIFICAR QUE A LISTA É CIRCULAR
		for (int i = 0; i < 21; i++) {
			System.out.println(lista.get(i));
		}
	}

}
