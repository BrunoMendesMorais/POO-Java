package br.InnerNestedClass;

public class ClasseDeFora {
	private String mensagem="ola mundo";
	
	class ClasseEmbutida{	
		void display() {
			System.out.println(mensagem);
		}
	}
	
	public void test() {
		ClasseEmbutida ce =new ClasseEmbutida();
	}
}
