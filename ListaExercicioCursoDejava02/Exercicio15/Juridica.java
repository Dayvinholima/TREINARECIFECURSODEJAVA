package Exercicio15;

import java.sql.Date;

public class Juridica extends Pessoas{
    private String cnpj;
    private String inscricaoEstadual;
    private Date fundacao;
    private Parceiro parceiro;
    
    public Juridica(int id, String nome, String nomeFantasia, String logadouro, int numero, String complemento,
            String bairro, String cep, String cidade, String uf, String cnpj, String inscricaoEstadual, Date fundacao) {
        
            super(id, nome, nomeFantasia, logadouro, numero, complemento, bairro, cep, cidade, uf);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.fundacao = fundacao;
    }

    public Juridica(int id, String nome, String nomeFantasia, String logadouro, int numero, String complemento,
            String bairro, String cep, String cidade, String uf, Parceiro parceiro) {
        super(id, nome, nomeFantasia, logadouro, numero, complemento, bairro, cep, cidade, uf);
        this.parceiro = parceiro;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Date getFundacao() {
        return fundacao;
    }

    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }

    public Parceiro getParceiro() {
        return parceiro;
    }

    public void setParceiro(Parceiro parceiro) {
        this.parceiro = parceiro;
    }
    
        
}
