package Exercicio15;

public class Usuario {
    private String login;
    private String senha;
    private String permissao;
    private Usuario usuario;
    
    public Usuario(String login, String senha, String permissao, Usuario usuario) {
        this.login = login;
        this.senha = senha;
        this.permissao = permissao;
        this.usuario = usuario;
        
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getPermissao() {
        return permissao;
    }
    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}