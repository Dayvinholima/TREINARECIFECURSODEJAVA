import java.util.Scanner;

public class Exercicio15 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro N (0 < N < 46): ");
        int N = scanner.nextInt();

        scanner.close();

        int anterior = 0;
        int atual = 1;

        System.out.print(anterior);

        for (int i = 1; i < N; i++) {
            System.out.print(" " + atual);
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

    }}






