package br.com.felipe.exercicio;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada l1 = new Lampada(127, "fluorescente", 110);
		Lampada l2 = new Lampada(220, 110);
		Lampada l3 = new Lampada(127, "LED", 20);
		
		
		System.out.println("Status da lampada l1: " + l1.getStatus());
		l1.acender();
		l1.verificarStatus();

		System.out.println("\nStatus da lampada l2: " + l2.getStatus());
		l2.verificarStatus();
		
		System.out.println("\nStatus da lampada l3: " + l3.getStatus());
		l3.acender();
		l3.apagar();		
		l3.verificarStatus();
		
		System.out.println(l3);
		

	}

}
