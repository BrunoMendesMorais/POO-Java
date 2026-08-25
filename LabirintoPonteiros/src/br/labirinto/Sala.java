package br.labirinto;

public class Sala {
	private String nome;
	
	Sala norte = null, sul = null, leste = null, oeste = null;
	
	public Sala(String sala){this.nome = sala;}
	
	public void setN(Sala sala) {this.norte = sala;}
	public void setS(Sala sala) {this.sul = sala;}
	public void setL(Sala sala) {this.leste = sala;}
	public void setO(Sala sala) {this.oeste = sala;}
	
	public Sala vaiN(){
		if(norte==null) {
			System.out.println("Sala não existe");
			return this;
		}
		return norte;
	}
	public Sala vaiS(){
		if(sul==null) {
			System.out.println("Sala não existe");
			return this;
		}
		return sul;
	}
	public Sala vaiL(){
		if(leste==null){
			System.out.println("Sala não existe");
			return this;
		}
		return leste;
	}
	public Sala vaiO(){
		if(oeste==null){
			System.out.println("Sala não existe");
			return this;
		}
		return oeste;
	}
	
	public String toString() {
		return nome;
	}

}
