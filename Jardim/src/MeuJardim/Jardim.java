package MeuJardim;

public class Jardim {
	private Flor flor1;
	private Flor flor2;
	private String nome;
	
	
	
	public void setFlor(Flor flor1, Flor flor2) {
		this.flor1 = flor1;
		this.flor2 = flor2;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimirJardim() {
		System.out.println("Jardim " + nome);
		this.flor1.imprimirFlor();
		this.flor2.imprimirFlor();
	}
}
