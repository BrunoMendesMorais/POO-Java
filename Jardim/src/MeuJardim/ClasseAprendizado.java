package MeuJardim;

public class ClasseAprendizado {
	int[] valores=new int[3];
	double[] val = {10.2,25.3,38.4};
	Petala[] petalas=new Petala[3];
	
	
	public void preencheValores() {
		valores[0]=10;
		valores[1]=20;
		valores[2]=30;
	
		for(int i=0;i<3;i++) {
			valores[i]+=1;
			System.out.println(valores[i]);
		}
	}
	public static void main(String[] args) {
		ClasseAprendizado cl=new ClasseAprendizado();
		cl.preencheValores();
	}
}
