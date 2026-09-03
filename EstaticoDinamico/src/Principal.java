
public class Principal {

	public static void main(String[] args) {
		ClasseDinamica cd1 = new ClasseDinamica(); 
		ClasseDinamica cd2 = new ClasseDinamica(); 
		ClasseDinamica cd3 = new ClasseDinamica();
		
		ClasseEstatica.incrementa();
		
		cd1.incrementa();
		cd2.incrementa();
		cd3.incrementa();
	}

}
