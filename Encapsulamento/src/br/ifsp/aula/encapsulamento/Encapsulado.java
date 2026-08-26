package br.ifsp.aula.encapsulamento;

public class Encapsulado {
	private int valor;
	private int[] valores;
	
	public Encapsulado() {
		
	}
	public Encapsulado(int[] valores) {
		
	}
	
	public void setValores(int[] Valores) {
		
	}
	
	public int[] getvalores() {
		return valores;
	}
	public void setValor(int valor) {
		if(valor<10000)return;
		this.valor=valor;
	}
	
	public int getValor() {
		return valor;
	}

}