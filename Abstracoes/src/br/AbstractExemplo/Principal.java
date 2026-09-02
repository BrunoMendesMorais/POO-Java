package br.AbstractExemplo;

public class Principal {

	public static void main(String[] args) {
//		somente os metodos do pai que existem nos filhos podem ser chamados 
		Circulo circulo=new Circulo(); 
		Quadrado quadrado =new Quadrado();
		
		circulo.setRaio(10);
		circulo.setXY(50, 50);
		
		circulo.draw();
		quadrado.draw();
	}

}
