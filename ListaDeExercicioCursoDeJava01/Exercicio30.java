
import java.util.Scanner;

public class Exercicio30 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.printf("Informe o valor de M:, ", i+1);
            int M = sc.nextInt();
            System.out.printf("Informe o valor de N: ", i+1 );
            int N = sc.nextInt();
            
            // Encontra o menor e o maior valor entre M e N
            int menor = Math.min(M, N);
            int maior = Math.max(M, N);

            // Inicializa a variável para armazenar a soma
            int soma = 0;

            // Imprime a sequência e calcula a soma dos inteiros consecutivos
            for (int j = menor; j <= maior; j++) {
                System.out.print(j + " ");
                soma += j;
            }

            System.out.println("Soma = " + soma);
        }

        sc.close();
    }
}
