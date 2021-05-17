package br.com.felipe.exercicio;

import java.util.Scanner;

public class TesteData {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o dia, mes e ano: ");
		int dia = scanner.nextInt();
		int mes = scanner.nextInt();
		int ano = scanner.nextInt();		
		
		Data data1 = new Data(dia, mes, ano);
		Data data2 = new Data(dia, mes, ano);		
		
				
				
		data1.diaSeguinte();
		System.out.println("Dia seguinte: " + data1);
		
		data2.diaAnterior();
		System.out.println("Dia anterior: " + data2);
		
		scanner.close();

	}

}
