package br.ifsp.Agragacao;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nome;
	
	List<Jogador> jogadores = new ArrayList<>();
	
	public void addJogador(Jogador jogador) {
		jogadores.add(jogador);
	}
	
	public String getJogadores() {
		String relatorio="";
		for(Jogador jogador:jogadores) {
			relatorio+=""+jogador.getNome()+"\n";
		}
		return relatorio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
