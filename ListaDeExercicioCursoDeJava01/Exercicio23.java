import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();

        scanner.close();

        // Realizar as comparações e imprimir os resultados
        System.out.println(x > y ? 1 : 0); // x é maior que y
        System.out.println(x == y ? 1 : 0); // x é igual a y
        System.out.println(x < y ? 1 : 0); // x é menor que y
        System.out.println(x != y ? 1 : 0); // x é diferente de y
        System.out.println(x >= y ? 1 : 0); // x é maior ou igual a y
        System.out.println(x <= y ? 1 : 0); // x é menor ou igual a y
    }
}





