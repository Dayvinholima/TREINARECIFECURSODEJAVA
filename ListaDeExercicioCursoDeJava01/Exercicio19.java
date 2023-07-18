import java.util.Scanner;

public class Exercicio19 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        scanner.close();

        double novoSalario;

        if (salarioAtual > 500) {
            novoSalario = salarioAtual * 1.10; // Aumento de 10% para salários acima de R$ 500
        } else if (salarioAtual > 300) {
            novoSalario = salarioAtual * 1.07; // Aumento de 7% para salários entre R$ 300 e R$ 500
        } else {
            novoSalario = salarioAtual * 1.05; // Aumento de 5% para salários abaixo de R$ 300
        }

        System.out.printf("Novo salário: %.2f%n", novoSalario);
    }
}