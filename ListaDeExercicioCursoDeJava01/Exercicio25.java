import java.util.Scanner;

public class Exercicio25 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os 5 números (0 ou 1) representando a Interface Gráfica, Inteligência Artificial, Encapsulamento, Indentação e Structs, respectivamente: ");
        String entrada = scanner.nextLine();
        scanner.close();

        String resultado = verificarAvaliacao(entrada);

        System.out.println(resultado);
    }

    public static String verificarAvaliacao(String entrada) {
        if (entrada.contains("0")) {
            return "Zero";
        } else {
            return "AVALIADO";
        }
    }
}