package br.com.felipe.exercicio;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data (int dia, int mes, int ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setDia(int dia) {
		if (dia > 0 && dia < 31) {
			this.dia = dia;
		}
	}
	
	public void setMes(int mes) {
		if (mes > 0 && mes < 13) {
			this.mes = mes;
		}
	}
	
	public void setAno(int ano) {
		if (ano > 0) {
			this.ano = ano;
		}
	}
	
	public void diaSeguinte () {		
		if (this.getDia() == 30) {
			this.setDia(1);
			if (this.getMes() == 12) {
				this.setMes(1);
				this.setAno(this.getAno() + 1);
			}else {
				this.setMes(this.getMes() + 1);
			}			
		}else {
			this.setDia(this.getDia() + 1);			
		}
		
	}
	
	
	public void diaAnterior() {
		if (this.getDia() == 1) {
			this.setDia(30);
			if (this.getMes() == 1) {
				this.setMes(12);
				this.setAno(this.getAno() - 1);
			}else {
				this.setMes(this.getMes() - 1);
			}
		} else {
			this.setDia(this.getDia() - 1);
		}
	}

	@Override
	public String toString() {
		return "Data: " + dia + "/" + mes + "/" + ano;
	}
	
	
}
