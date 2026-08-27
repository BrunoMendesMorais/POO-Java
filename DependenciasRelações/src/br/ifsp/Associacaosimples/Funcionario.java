package br.ifsp.Associacaosimples;

public class Funcionario extends Pessoa{
	private Dependente dependente;
	
	//injeção de dependência
	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}
	
	public Funcionario(String nome) {
		super(nome);
	}
}
