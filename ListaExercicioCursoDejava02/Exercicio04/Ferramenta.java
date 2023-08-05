package Exercicio04;
public class Ferramenta extends ItemDeLoja {
    private String categoria;
    private Integer serial;
    public Ferramenta(String categoria, Integer serial) {
        this.categoria = categoria;
        this.serial = serial;
    }
    public Ferramenta(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoitem, String categoria,
            Integer serial) {
        super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoitem);
        this.categoria = categoria;
        this.serial = serial;
    }
    public int getidentificador(){
        return getidentificador();
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Integer getSerial() {
        return serial;
    }
    public void setSerial(Integer serial) {
        this.serial = serial;
    }
    
}
