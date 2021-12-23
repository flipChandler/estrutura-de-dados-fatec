package br.com.estrutura.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class CarroTest {

	public static void main(String[] args) {
		
		List<Carro> carros = new ArrayList<>();
		
		carros.add(new Carro("Renault"));
		carros.add(new Carro("Ford"));
		carros.add(new Carro("Chevrolet"));
		carros.add(new Carro("Ferrari"));
		carros.add(new Carro("Mercedes"));
		
		System.out.println(carros.contains(new Carro("Ford"))); // true
		System.out.println(new Carro("Ford").hashCode());     // 2195706
		System.out.println(new Carro("Ford").hashCode());     // 2195706  é o mesmo hashCode (Marca)
		
		Carro carro1 = new Carro("Ford");
		Carro carro2 = new Carro("Chevrolet");
		
		System.out.println(carro1.equals(carro2)); // true  | se comentar a linha que testa se a marca é igual
	}

}
