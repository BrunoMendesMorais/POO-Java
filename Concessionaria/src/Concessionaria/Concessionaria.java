package Concessionaria;
import java.util.Scanner;

public class Concessionaria {

    private Veiculo[] veiculos = new Veiculo[100];
    private int a = 0;
    private static Scanner leitor = new Scanner(System.in);
    
    public void addCarro() {
    	int i;
    	a ++;
    	for(i=0; i<100 && veiculos[i]!= null; i++);
    	if(veiculos[i] == null) {
    		System.out.println("Digite o marca do veiculo: ");
    	    String marca = leitor.next();
    	    System.out.println("Digite o modelo do veiculo: ");
    	    String modelo = leitor.next();
    	    System.out.println("Digite o potencia do veiculo: ");
    	    double potencia = leitor.nextDouble();
    	    System.out.println("Digite o ano do veiculo: ");
    	    String ano = leitor.next();
    		veiculos[i] = new Veiculo(a,marca,modelo,ano,potencia);
		}
    }
    public void alterar() {
    	int i;
    	
    	System.out.println("Digite o id do veiculo: ");
	    int id = leitor.nextInt();
	    
    	for(i=0; i<100 && veiculos[i]!= null; i++);
    	if(veiculos[i].getId() == id) {
    		System.out.println("CASO NÃO QUEIRA ALTERAR OS DADOS INFORME: 0");
    		System.out.println("Digite o marca do veiculo: ");
    	    String marca = leitor.next();
    	    System.out.println("Digite o modelo do veiculo: ");
    	    String modelo = leitor.next();
    	    System.out.println("Digite o potencia do veiculo: ");
    	    double potencia = leitor.nextDouble();
    	    System.out.println("Digite o ano do veiculo: ");
    	    String ano = leitor.next();
    	    veiculos[i].alterar(marca, modelo, ano, potencia);
    	}
    	else System.out.println("Id não encontrado");
    }
    
    public void excluir() {
    	int i;
    	
    	System.out.println("Digite o id do veiculo: ");
    	int id = leitor.nextInt();
    	
    	for(i=0; i<100 && veiculos[i]!= null; i++);
    	
    	if(veiculos[i].getId() == id)veiculos[i] = null;
    	else System.out.println("Veiculo não encontrado");
    }
    
    public void exibirVeiculos() {
    	for(int i=0; i<100 && veiculos[i]!= null; i++) {
    		veiculos[i].consultar();
    	}
    }
}
