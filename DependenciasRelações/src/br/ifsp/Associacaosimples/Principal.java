package br.ifsp.Associacaosimples;

public class Principal {

	public static void main(String[] args) {
		Dependente filho=new Dependente();
		filho.setNome("Lucas");
		
		Funcionario pai=new Funcionario();
		pai.setNome("Mateus");
		
		pai.setDependente(filho);
	}

}
