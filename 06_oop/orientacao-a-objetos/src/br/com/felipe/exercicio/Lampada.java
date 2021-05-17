package br.com.felipe.exercicio;

import java.util.Random;

public class Lampada {
	private int tensao;
	private String tipo;
	private int potencia;
	private int status;
	
	public Lampada(int tensao, String tipo, int potencia) {
		setTensao(tensao);
		setTipo(tipo);
		setPotencia(potencia);
		
		Random random = new Random();
		setStatus(random.nextInt(2));
	}
	
	public Lampada(int tensao, int potencia) {
		setTensao(tensao);
		setTipo("incandescente");
		setPotencia(potencia);
		
		Random random = new Random();
		setStatus(random.nextInt(2));
	}
	
	public int getTensao() {
		return tensao;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setTensao(int tensao) {
		if (tensao == 127 || tensao == 220) {
			this.tensao = tensao;
		}
	}
	
	private void setStatus(int status) {
		this.status = status;
	}
	
	public void setPotencia (int potencia) {
		if (potencia > 9 && potencia <= 120) {
			this.potencia = potencia;
		}
	}
	
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
	
	public void apagar() {
		if (this.status == 1) {
			setStatus(0);
		}
	}
	
	public void acender() {
		if (this.status == 0) {
			setStatus(1);
		}
	}
	
	public void verificarStatus() {
		switch (this.status) {
			case 0:
				System.out.println("Lâmpada está apagada!");
				break;
			case 1:
				System.out.println("Lâmpada está acesa!");
				break;
		}
	}

	@Override
	public String toString() {
		return "Lampada [tensao=" + tensao + ", tipo=" + tipo + ", potencia=" + potencia + ", status=" + status + "]";
	}
	
	
	
}
