import java.math.BigInteger;
import java.util.Scanner;

public class Exercicio46{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de M (0 <= M <= 20): ");
        int M = scanner.nextInt();

        System.out.print("Digite o valor de N (0 <= N <= 20): ");
        int N = scanner.nextInt();

        BigInteger fatorialM = calcularFatorial(M);
        BigInteger fatorialN = calcularFatorial(N);
        BigInteger somaFatoriais = fatorialM.add(fatorialN);

        System.out.println("A soma dos fatoriais de M e N é: " + somaFatoriais);

        scanner.close();
    }

    public static BigInteger calcularFatorial(int numero) {
        BigInteger fatorial = BigInteger.ONE;

        for (int i = 2; i <= numero; i++) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }

        return fatorial;
    }

}