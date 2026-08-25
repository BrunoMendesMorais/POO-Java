package br.labirinto;

public class Navegador {
	
	Sala salaAtual = null;
	public Navegador(Sala sala) {
		salaAtual = sala;
	}
	
	public void navegarNorte() {
		salaAtual=salaAtual.vaiN();
		mostrarSalaAtual();
	}
	public void navegarSul() {
		salaAtual=salaAtual.vaiS();
		mostrarSalaAtual();
	}
	public void navegarLeste() {
		salaAtual=salaAtual.vaiL();
		mostrarSalaAtual();
	}
	public void nevegarOeste() {
		salaAtual=salaAtual.vaiO();
		mostrarSalaAtual();
	}
	
	public void mostrarSalaAtual() {
		System.out.println(salaAtual);
	}
}
