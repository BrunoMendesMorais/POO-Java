package br.ifsp.Agragacao;

public class PrincipalAgragacao {

	public static void main(String[] args) {
		Jogador jogador1 =new Jogador();
		jogador1.setNome("JogouMuito");
		Jogador jogador2 =new Jogador();
		jogador2.setNome("JogouNada");
		
		Time time = new Time();
		time.setNome("Top");
		
		time.addJogador(jogador1);
		time.addJogador(jogador2);
		
		System.out.println(time.getJogadores());
	}

}
