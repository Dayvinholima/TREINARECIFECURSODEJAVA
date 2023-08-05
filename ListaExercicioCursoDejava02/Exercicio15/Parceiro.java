package Exercicio15;

import java.util.List;

public class Parceiro { 
    private String tipoPessoa;
    private float desempenho;
    private List<Fisica> pessoaFisicas;
    private List<Juridica> pessoaaJuridicas;
    
    public Parceiro(String tipoPessoa, float desempenho, List<Fisica> pessoaFisicas, List<Juridica> pessoaaJuridicas) {
        this.tipoPessoa = tipoPessoa;
        this.desempenho = desempenho;
        this.pessoaFisicas = pessoaFisicas;
        this.pessoaaJuridicas = pessoaaJuridicas;
    }
    public String getTipoPessoa() {
        return tipoPessoa;
    }
    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
    public float getDesempenho() {
        return desempenho;
    }
    public void setDesempenho(float desempenho) {
        this.desempenho = desempenho;
    }
    public List<Fisica> getPessoaFisicas() {
        return pessoaFisicas;
    }
    public void setPessoaFisicas(List<Fisica> pessoaFisicas) {
        this.pessoaFisicas = pessoaFisicas;
    }
    public List<Juridica> getPessoaaJuridicas() {
        return pessoaaJuridicas;
    }
    public void setPessoaaJuridicas(List<Juridica> pessoaaJuridicas) {
        this.pessoaaJuridicas = pessoaaJuridicas;
    }
    
}
