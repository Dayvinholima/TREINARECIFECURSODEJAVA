import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X (1 < X < 20): ");
        int X = scanner.nextInt();

        System.out.print("Digite o valor de Y (X < Y < 100000): ");
        int Y = scanner.nextInt();

        printSequenciaXY(X, Y);

        scanner.close();
    }

    public static void printSequenciaXY(int X, int Y) {
        int count = 1;

        for (int i = 1; i <= Y; i++) {
            System.out.print(i);

            if (count == X || i == Y) {
                System.out.println();
                count = 1;
            } else {
                System.out.print(" ");
                count++;
            }
        }
    }
}
    

