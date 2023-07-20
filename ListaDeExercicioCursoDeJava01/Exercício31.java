import java.util.Scanner;

public class Exercício31 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2;
        boolean nota1Valida = false;
        boolean nota2Valida = false;

        do {
            System.out.print("Digite a primeira nota: ");
            nota1 = scanner.nextDouble();
            if (nota1 >= 0 && nota1 <= 10) {
                nota1Valida = true;
            } else {
                System.out.println("NOTA INVÁLIDA");
            }
        } while (!nota1Valida);

        do {
            System.out.print("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();
            if (nota2 >= 0 && nota2 <= 10) {
                nota2Valida = true;
            } else {
                System.out.println("NOTA INVÁLIDA");
            }
        } while (!nota2Valida);

        double media = (nota1 + nota2) / 2;
        System.out.printf("MÉDIA = %.2f%n", media);

        scanner.close();
    }
}
    

