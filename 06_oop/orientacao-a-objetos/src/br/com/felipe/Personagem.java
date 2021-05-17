package br.com.felipe;

public class Personagem {
	
	private String nome;
	private int sono;
	private int forca;
	private int fome;
	
	// metodos de acessos = getters
	public String getNome() {
		return nome;
	}
	
	public int getSono() {
		return sono;
	}
	
	public int getForca() {
		return forca;
	}
	
	public int getFome() {
		return fome;
	}
	
	// metodos modificadores = setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSono(int sono) {
		if (sono >= 0 && sono <= 10) {
			this.sono = sono;
		}
	}
	
	public void setForca(int forca) {
		if (forca >= -5 && forca <= 5) {
			this.forca = forca;
		}
	}
	
	public void setFome(int fome) {
		if (fome <= 8 && fome >= 0) {
			this.fome = fome;
		}
	}
	
	public void lutar() {
		
	}
	
	public void comer() {
		
	}
	
	public void dormir() {
		
	}
	
	
}
