import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.close();

        System.out.print("Digite um número inteiro com quatro algarismos: ");
        int numero = scanner.nextInt();

        // Verifica se o número tem quatro algarismos
        if (numero < 1000 || numero > 9999) {
            System.out.println("O número deve ter exatamente quatro algarismos.");
        } else {
            // Extrai os dígitos individuais do número
            int primeiroDigito = numero % 10;
            int segundoDigito = (numero / 10) % 10;
            int terceiroDigito = (numero / 100) % 10;
            int quartoDigito = numero / 1000;

            // Constrói o número invertido
            int numeroInvertido = primeiroDigito * 1000 + segundoDigito * 100 + terceiroDigito * 10 + quartoDigito;

            System.out.println("Número invertido: " + numeroInvertido);
        }
    }
    
}
