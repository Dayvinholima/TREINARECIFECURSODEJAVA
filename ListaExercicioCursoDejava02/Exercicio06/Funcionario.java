package Exercicio06;
import javax.xml.crypto.Data;

public class Funcionario {
    private Integer matricula;
    private String nomeCompleto;
    private String cpf;
    private Data date;
    private Integer sexo;
    private Double salario;
    private int telefone;
    
    
    public Funcionario(Integer matricula, String nomeCompleto, String cpf, Data date, Integer sexo, Double salario,
            int telefone) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.date = date;
        this.sexo = sexo;
        this.salario = salario;
        this.telefone = telefone;
    }


    public Integer getMatricula() {
        return matricula;
    }


    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }


    public String getNomeCompleto() {
        return nomeCompleto;
    }


    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public Data getDate() {
        return date;
    }


    public void setDate(Data date) {
        this.date = date;
    }


    public Integer getSexo() {
        return sexo;
    }


    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }


    public Double getSalario() {
        return salario;
    }


    public void setSalario(Double salario) {
        this.salario = salario;
    }


    public int getTelefone() {
        return telefone;
    }


    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
    
}
