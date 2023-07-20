import java.util.Scanner;

public class Exercicio33 {
    
    public static class PumSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inteiro N: ");
        int N = scanner.nextInt();  // recebe o valar inteiro que sera usado na linha 21

        printPumSequence(N);

        scanner.close();
    }

    public static void printPumSequence(int N) {
        int num = 1;

        for (int i = 0; i < N; i++) {
            System.out.printf("%d %d %d PUM%n", num, num + 1, num + 2);
            num += 4;
        }
    }
}
}
