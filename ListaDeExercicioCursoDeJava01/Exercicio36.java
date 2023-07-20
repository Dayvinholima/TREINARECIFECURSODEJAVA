import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de HO que Papai Noel deve falar: ");
        int N = scanner.nextInt();

        printHO(N);

        scanner.close();
    }

    public static void printHO(int N) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            sb.append("HO ");
        }

        sb.append("!");
        System.out.println(sb.toString());
    }

}
