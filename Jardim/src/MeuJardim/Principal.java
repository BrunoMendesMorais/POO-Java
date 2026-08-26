package MeuJardim;

public class Principal {
	public static void main(String[] args) {
		Petala petala01 = null;
		petala01 =new Petala();
		
		Petala petala02=new Petala();
		petala02.imprimirCor();
		
		petala01=petala02;
		
		Petala petala03 = new Petala();
		petala03.setColor("Sei lá");
		Petala petala04 = new Petala();
		petala04.setColor("Sei lá 2");
		
		Petala petala05 = new Petala();
		petala05.setColor("Sei lá 3");
		
		Petala petala06 = new Petala();
		petala06.setColor("Sei lá 4");
		
		
		Flor rosa=new Flor();
		rosa.addPetala(petala01);
		rosa.addPetala(petala02);
		rosa.addPetala(petala03);
		rosa.setNome("Rosa");
		rosa.imprimirVetorDeFlor();
		
		
		
		Flor florOriginal=new Flor();
		florOriginal.addPetala(petala04);
		florOriginal.addPetala(petala05);
		florOriginal.addPetala(petala06);
		florOriginal.setNome("Original");
		florOriginal.imprimirVetorDeFlor();
		
//		Jardim jardim = new Jardim();
//		jardim.setNome("café");
//		jardim.setFlor(florOriginal, rosa);
//		jardim.imprimirJardim();
	}
	
}
