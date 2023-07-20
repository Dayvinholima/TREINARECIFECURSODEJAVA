import java.util.Scanner;

public class Exercicio42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor antigo do ingresso: ");
        double valorAntigo = scanner.nextDouble();

        System.out.print("Digite o valor novo do ingresso: ");
        double valorNovo = scanner.nextDouble();

        double aumentoPorcentagem = calcularAumentoPorcentagem(valorAntigo, valorNovo);
        System.out.printf("O preço do cinema subiu %.2f%% !!!%n", aumentoPorcentagem);

        scanner.close();
    }

    public static double calcularAumentoPorcentagem(double valorAntigo, double valorNovo) {
        double aumento = valorNovo - valorAntigo;
        double porcentagem = (aumento / valorAntigo) * 100;
        return porcentagem;
    }
}
    

