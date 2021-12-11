package br.com.estrutura.no;

public class NoTest {

	public static void main(String[] args) {
		No no1 = new No("Conteúdo no1");
		
		No no2 = new No("Conteúdo no2");
		no1.setProximoNo(no2);
		
		No no3 = new No("Conteúdo no3");
		no2.setProximoNo(no3);
		
		No no4 = new No("Conteúdo no4");
		no3.setProximoNo(no4);
		
		System.out.println(no1);           // Conteúdo no1
		System.out.println(no1.getProximoNo()); // Conteúdo no2
		System.out.println(no2);           // Conteúdo no2
		
		System.out.println("------------------------------------");
		
		System.out.println(no1);  // Conteúdo no1
		System.out.println(no1.getProximoNo()); // Conteúdo no2
		System.out.println(no1.getProximoNo().getProximoNo()); // // Conteúdo no3
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo()); // Conteúdo no4
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); // null
		
		
		
		

	}

}
