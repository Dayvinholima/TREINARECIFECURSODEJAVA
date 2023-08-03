package teste;

import java.sql.Date;

public class carro{
    private String chassi;
    private String cor;
    private int anoModelo;
    private Date date;
    
    
    public carro(String chassi, String cor, int anoModelo, Date date) {
        this.chassi = chassi;
        this.cor = cor;
        this.anoModelo = anoModelo;
        this.date = date;
    }


    public String getChassi() {
        return chassi;
    }


    public void setChassi(String chassi) {
        this.chassi = chassi;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public int getAnoModelo() {
        return anoModelo;
    }


    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }

}