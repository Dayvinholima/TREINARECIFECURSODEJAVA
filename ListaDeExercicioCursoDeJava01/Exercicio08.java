import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a renda do homem: ");
        double rendaHomem = input.nextDouble();

        System.out.print("Digite a renda da mulher: ");
        double rendaMulher = input.nextDouble();
        
        input.close();

        double rendaConjunta = rendaHomem + rendaMulher;

        double aliquota;
        if (rendaConjunta <= 900.00) {
            aliquota = 0.0;
        } else if (rendaConjunta <= 1500.00) {
            aliquota = 0.10;
        } else if (rendaConjunta <= 2500.00) {
            aliquota = 0.15;
        } else {
            aliquota = 0.25;
        }

        double impostoRenda = rendaConjunta * aliquota;
        double rendaLiquida = rendaConjunta - impostoRenda;

        System.out.println("Renda Conjunta: " + rendaConjunta);
        System.out.println("Alíquota utilizada: " + (aliquota * 100) + "%");
        System.out.println("Imposto de Renda: " + impostoRenda);
        System.out.println("Renda Líquida: " + rendaLiquida);

    
    }

}
