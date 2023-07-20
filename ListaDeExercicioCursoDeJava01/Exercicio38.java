import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        boolean primo = verificarPrimo(numero);

        if (primo) {
            System.out.println("É PRIMO");
        } else {
            System.out.println("NÃO É PRIMO");
        }

        scanner.close();
    }

    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se o número for divisível por algum i entre 2 e a raiz quadrada do próprio número, não é primo
            }
        }

        return true; // Se não foi encontrado nenhum divisor entre 2 e a raiz quadrada do número, ele é primo.
    }
}
    

