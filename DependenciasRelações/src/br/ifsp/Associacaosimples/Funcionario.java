package br.ifsp.Associacaosimples;

public class Funcionario {
	private String nome;
	private Dependente dependente;
	
	//injeção de dependência
	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
