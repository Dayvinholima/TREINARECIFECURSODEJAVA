import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro positivo: ");
        int x = scanner.nextInt();

        scanner.close();

        int quantidadeImpares = 0;

        while (quantidadeImpares < 6) {
            if (x % 2 != 0) {
                System.out.println(x);
                quantidadeImpares++;
            }
            x++;
        }
    }
}