package br.StaticNestedClass;

public class ClasseDeFora {
	static int valroestatico=20;
	int valorPrimitivo=30;
	
	static class ClasseDeDentroAninhada{
		void display() {
			System.out.println(valroestatico);
//			System.out.println(valorPrimitivo); ERRO
		}
	}
}