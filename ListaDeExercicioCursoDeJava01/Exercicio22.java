import java.util.Scanner;

public class Exercicio22 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.close();

        int anoCarroMaisNovo = 0;
        double velocidadeCarroMaisRapido = 0;
        double somaVelocidades = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o ano do " + i + "º carro: ");
            int ano = scanner.nextInt();

            System.out.print("Digite a velocidade do " + i + "º carro: ");
            double velocidade = scanner.nextDouble();

            if (i == 1 || ano > anoCarroMaisNovo) {
                anoCarroMaisNovo = ano;
            }

            if (i == 1 || velocidade > velocidadeCarroMaisRapido) {
                velocidadeCarroMaisRapido = velocidade;
            }

            somaVelocidades += velocidade;
        }

        double velocidadeMedia = somaVelocidades / 3;

        System.out.println("Ano do carro mais novo = " + anoCarroMaisNovo);
        System.out.printf("Velocidade do mais rápido = %.2f%n", velocidadeCarroMaisRapido);
        System.out.printf("Velocidade média = %.2f%n", velocidadeMedia);
    }
}





