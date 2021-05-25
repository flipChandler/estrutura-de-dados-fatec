package br.com.fatec;

import javax.swing.JOptionPane;

public class TestePilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		JOptionPane.showMessageDialog(null, pilha);
		
		pilha.push(10);
		pilha.push(20);
		System.out.println(pilha);
		
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade da pilha"));		
		Pilha pilha2 = new Pilha(c);
		pilha2.push(3);
		pilha2.push(5);
		pilha2.push(7);
		System.out.println(pilha2);
		
		System.out.println(pilha2.pull() + " foi desempilhado");
		System.out.println(pilha2);
	}

}
