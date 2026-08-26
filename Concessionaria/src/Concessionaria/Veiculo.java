package Concessionaria;
public class Veiculo {

    private int id;
    private String marca;
    private String modelo;
    private String ano;
    private double potencia; 
    
    public int getId() {
    	return this.id;
    }

    public Veiculo(int id, String marca, String modelo, String ano, double potencia) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
    }
    
    public void alterar(String marca, String modelo, String ano, double potencia) {
    	if(!marca.equals("0")) this.marca = marca;
    	if(!ano.equals("0")) this.ano = ano;
    	if(!modelo.equals("0")) this.modelo = modelo;
    	if(potencia!=0) this.potencia = potencia;
    }

    public void consultar() {
        System.out.println("Veiculo ID: " + id);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Ano: " + this.ano);
    }
}