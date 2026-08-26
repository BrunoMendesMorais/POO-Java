package MeuJardim;

public class Flor {
	private String nome;
//	private Petala petala1;
//	private Petala petala2;
	
	Petala[] petalas = new Petala[3];
	int indice=0;
	
	public void addPetala(Petala petala) {
		petalas[indice]=petala;
		indice++;
		
		if(indice>2) indice =0;
	}
	
	public Flor(){
	}
	
	public void imprimirFlor(){
		System.out.print("Cor da Petala ");
		System.out.println(nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimirVetorDeFlor() {
		System.out.print("Flor: ");
		System.out.println(nome);
		System.out.print("Cor da Petala: ");
		for(int i=0;i<indice;i++) {
			petalas[i].imprimirCor();
		}
		
	}
}
