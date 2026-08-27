package br.ifsp.Associacaosimples;

public class Principal {

	public static void main(String[] args) {
		Dependente filho=new Dependente("jao");
		filho.setNome("Lucas");
		
		Funcionario pai=new Funcionario("davi");
		filho.setNome("Mateus");
		
		pai.setDependente(filho);
		
		Pessoa p=new Pessoa("Pessoa P");
		//mostrarPessoa(p);
		mostrarPessoa(filho);
		//mostrarPessoa(pai);
		
		Pessoa x=new Dependente ("Joeslma");
	}
	
	//não podemos acessar os métodos do filho, acessando o filho pela classe do pai
	
	public static void mostrarPessoa(Pessoa pessoa) {
		System.out.println(pessoa.getNome());
		
	}
}
