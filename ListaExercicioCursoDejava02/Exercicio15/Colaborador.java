package Exercicio15;

import java.sql.Date;

public class Colaborador extends Fisica{
    
    private String ctps;
    private String pis;
    private String tituloEleitor;
    private boolean reservista;
    private String estadocivil;
    private String numDependentes;
    private boolean ativo;
    private String setor;
    private float salario;
    private String telefone1;
    private String telefone2;
    private String emailPessoal;
    private String emailCorporativo;
    private boolean estaRegistrado;
    private Usuario usuario;

    public Colaborador(int id, String nome, String nomeFantasia, String logadouro, int numero, String complemento,
            String bairro, String cep, String cidade, String uf, String cpf, String rg, String genero, Date nasc,
            Usuario usuario) {
        super(id, nome, nomeFantasia, logadouro, numero, complemento, bairro, cep, cidade, uf, cpf, rg, genero, nasc);
        this.usuario = usuario;
    }

    public Colaborador(int id, String nome, String nomeFantasia, String logadouro, int numero, String complemento,
            String bairro, String cep, String cidade, String uf, String cpf, String rg, String genero, Date nasc,
            String ctps, String pis, String tituloEleitor, boolean reservista, String estadocivil,
            String numDependentes, boolean ativo, String setor, float salario, String telefone1, String telefone2,
            String emailPessoal, String emailCorporativo, boolean estaRegistrado) {
        
            super(id, nome, nomeFantasia, logadouro, numero, complemento, bairro, cep, cidade, uf, cpf, rg, genero, nasc);
        this.ctps = ctps;
        this.pis = pis;
        this.tituloEleitor = tituloEleitor;
        this.reservista = reservista;
        this.estadocivil = estadocivil;
        this.numDependentes = numDependentes;
        this.ativo = ativo;
        this.setor = setor;
        this.salario = salario;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.emailPessoal = emailPessoal;
        this.emailCorporativo = emailCorporativo;
        this.estaRegistrado = estaRegistrado;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    public boolean isReservista() {
        return reservista;
    }

    public void setReservista(boolean reservista) {
        this.reservista = reservista;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(String numDependentes) {
        this.numDependentes = numDependentes;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getEmailPessoal() {
        return emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }

    public String getEmailCorporativo() {
        return emailCorporativo;
    }

    public void setEmailCorporativo(String emailCorporativo) {
        this.emailCorporativo = emailCorporativo;
    }

    public boolean isEstaRegistrado() {
        return estaRegistrado;
    }

    public void setEstaRegistrado(boolean estaRegistrado) {
        this.estaRegistrado = estaRegistrado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void demitir() {
        if (estaRegistrado) {
            estaRegistrado = false;
            System.out.println(getNome() + " foi demitido.");
        } else {
            System.out.println(getNome() + " já está demitido(a).");
        }
    }

    public void admitir() {
        if (!estaRegistrado) {
            estaRegistrado = true;
            System.out.println(getNome() + " foi admitido(a) como " + setor + ".");
        } else {
            System.out.println(getNome() + " já está empregado(a).");
        }
    }


    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + setor);
        System.out.println("Situação: " + (estaRegistrado ? "Empregado" : "Demitido"));
    }
}
/* nada a  declarar */