package br.com.estrutura.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("Nome", "Felipe");
		aluno.put("Idade", "17");
		aluno.put("Media", "8.5");
		aluno.put("Turma", "3A");
		
		Map<String, String> aluno2 = new HashMap<>();
		
		aluno2.put("Nome", "Sibila");
		aluno2.put("Idade", "87");
		aluno2.put("Media", "6.5");
		aluno2.put("Turma", "5A");

		
		System.out.println(aluno);
		
		// traz o conjunto de chaves desse map
		System.out.println(aluno.keySet());  // Nome, Idade, Media, Turma
		System.out.println(aluno.values());  // Felipe, 17, 8.5, 3A
		
		List<Map<String, String>> listaAlunos = new ArrayList<>();
		listaAlunos.add(aluno);
		listaAlunos.add(aluno2);
		System.out.println(listaAlunos);
		
		System.out.println(aluno.containsKey("Nome")); // true
		
	}

}
