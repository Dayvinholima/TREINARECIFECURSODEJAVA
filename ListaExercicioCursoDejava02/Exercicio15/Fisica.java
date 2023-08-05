package Exercicio15;
import java.sql.Date;

public class Fisica extends Pessoas{
    private String cpf;
    private String rg;
    private String genero;
    private Date nasc;
    private Parceiro parceiro;

    public Fisica(int id, String nome, String nomeFantasia, String logadouro, int numero, String complemento,
            String bairro, String cep, String cidade, String uf, String cpf, String rg, String genero, Date nasc) {
        
            super(id, nome, nomeFantasia, logadouro, numero, complemento, bairro, cep, cidade, uf);
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.nasc = nasc;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getRg() {
        return rg;
    }


    public void setRg(String rg) {
        this.rg = rg;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public Date getNasc() {
        return nasc;
    }


    public void setNasc(Date nasc) {
        this.nasc = nasc;
    }


    public Parceiro getParceiro() {
        return parceiro;
    }


    public void setParceiro(Parceiro parceiro) {
        this.parceiro = parceiro;
    }

}