import java.util.Scanner;

public class Exercicio17 {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Número de casos de teste

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt(); // Número a ser testado

            scanner.close();

            if (ehPrimo(x)) {
                System.out.println(x + " é primo");
            } else {
                System.out.println(x + " não é primo");
            }
        }
    }

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Se tiver algum divisor, não é primo
            }
        }

        return true; // Se não tiver divisores além de 1 e ele mesmo, é primo
    }
}