package br.ifsp.aula.encapsulamento;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[] valoresTri = {4,6,7};
		
		Encapsulado pacote=new Encapsulado();
		pacote.setValores(valoresTri);

		Encapsulado pacoteFull=new Encapsulado(valoresTri);
		
		int[] vet=pacoteFull.getvalores();
		Scanner leitor =new Scanner(System.in);
		
		String nome=leitor.next();
		int valorI=leitor.nextInt();
		double valorD=leitor.nextDouble();
		byte valorB=leitor.nextByte();
		
		leitor.close();
	}
}
