package Exercicio04;
public class alimento extends ItemDeLoja {

    private int selo;

    public alimento(int selo) {
        this.selo = selo;
    }

    public int getSelo() {
        return selo;
    }

    public int getIdentificador() {
        return getSelo();
    }

    public void setSelo(int selo) {
        this.selo = selo;
    }
}