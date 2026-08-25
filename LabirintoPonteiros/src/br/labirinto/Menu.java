package br.labirinto;

import java.util.Scanner;

public class Menu {
	
	static Scanner leitor=new Scanner(System.in);
	
	public int mostrarMenu() {
		System.out.println("escolha uma opção");
		System.out.println("1-Norte");
		System.out.println("2-sul");
		System.out.println("3-Leste");
		System.out.println("4-Oeste");
		System.out.println("5-Sair");
	
		System.out.println("escolha uma opção");
		
		int opcao = leitor.nextInt();
		return opcao;
	}
}
