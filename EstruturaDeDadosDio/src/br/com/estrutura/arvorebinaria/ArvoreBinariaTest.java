package br.com.estrutura.arvorebinaria;

import br.com.estrutura.arvorebinaria.model.Obj;

public class ArvoreBinariaTest {
	
	public static void main(String[] args) {
		
		ArvoreBinaria<Obj> arvoreBinaria = new ArvoreBinaria<>();
		
		arvoreBinaria.inserir(new Obj(13));
		arvoreBinaria.inserir(new Obj(10));
		arvoreBinaria.inserir(new Obj(25));
		arvoreBinaria.inserir(new Obj(2));
		arvoreBinaria.inserir(new Obj(12));
		arvoreBinaria.inserir(new Obj(20));
		arvoreBinaria.inserir(new Obj(31));
		arvoreBinaria.inserir(new Obj(29));
		arvoreBinaria.inserir(new Obj(32));
		
		arvoreBinaria.exibirInOrdem();
		arvoreBinaria.exibirPosOrdem();
		arvoreBinaria.exibirPreOrdem();
	}
}
