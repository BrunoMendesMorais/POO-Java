package br.ifsp.Associacaosimples;

public class Dependente extends Pessoa{
	public Dependente(String nome) {
		super(nome);
		
		super.nome="Jao";
		
		super.metodoImaginario();
	}
	
	@Override
	public void metodoImaginario() {
		
	}
	
	public void metodoNoFilho() {
		
	}
}
