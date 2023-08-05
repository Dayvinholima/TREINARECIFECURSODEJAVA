package Exercicio03;
public class Terrestre extends MeioDeTransporte {
    private int qtdeRoda;
    private double potencia;

    public Terrestre() {
        super();
    }

    
    public Terrestre (int id, short ano, String modelo, double cargaMaxima, int qtdeRoda, double potencia) {
        super(id, ano, modelo, cargaMaxima); 
        this.qtdeRoda = qtdeRoda;
        this.potencia = potencia;
    }

    public int getQtdeRoda() {
        return qtdeRoda;
    }

    public void setQtdeRoda(int qtdeRoda) {
        this.qtdeRoda = qtdeRoda;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    
    public Double consumo() {
        return 0.0; 
    }
}