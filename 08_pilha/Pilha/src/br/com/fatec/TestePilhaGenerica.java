package br.com.fatec;

public class TestePilhaGenerica {

	public static void main(String[] args) {
		
		PilhaGenerica<Carta> pilhaCartas = new PilhaGenerica<>();
		
		PilhaGenerica<Integer> pilhaInteiros = new PilhaGenerica<>();
		
		Carta c1 = new Carta ("copas", "valete");
		Carta c2 = new Carta ("espadas", "ás");
		
		pilhaCartas.push(c1);
		pilhaCartas.push(c2);
		pilhaCartas.push(new Carta("paus", "rei"));
		
		pilhaInteiros.push(23); // autoboxing = promovendo int para Integer
		pilhaInteiros.push(45);
		
		System.out.println(pilhaCartas);
		System.out.println(pilhaInteiros);
		
	}

}
