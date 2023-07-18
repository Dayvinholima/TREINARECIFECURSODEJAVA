import java.util.Scanner;

public class Exercicio20 {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do bairro (S: Santa Ana; I: Industriários; T: Tabatinga): ");
        String bairro = scanner.next().toUpperCase();

        scanner.close();

        double renda;
        double consumo;

        if (bairro.equals("S") || bairro.equals("I") || bairro.equals("T")) {
            System.out.print("Digite a renda da família em reais: ");
            renda = scanner.nextDouble();

            System.out.print("Digite o consumo em reais: ");
            consumo = scanner.nextDouble();

            if (renda < 0 || consumo < 0) {
                System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
                return;
            }

            double desconto = 0;

            if (bairro.equals("S")) {
                if (renda >= 50 && renda <= 500) {
                    desconto = 50;
                } else if (renda > 500 && renda <= 1000) {
                    desconto = 25;
                }
            } else if (bairro.equals("I")) {
                if (renda >= 240 && renda <= 1000) {
                    desconto = 240;
                } else if (renda > 1000 && renda <= 5000) {
                    desconto = 120;
                }
            } else if (bairro.equals("T")) {
                if (renda > 5000 && renda <= 10000) {
                    desconto = 720;
                } else if (renda > 10000 && renda <= 20000) {
                    desconto = 360;
                }
            }

            double valorFinal = consumo - desconto;

            System.out.printf("%.2f%n", valorFinal);
        } else {
            System.out.println("BAIRRO INVÁLIDO");
        }
    }
}