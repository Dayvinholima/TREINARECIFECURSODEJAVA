import java.util.Scanner;

public class exercicio40 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        int lado1 = scanner.nextInt();

        System.out.print("Digite o segundo lado do triângulo: ");
        int lado2 = scanner.nextInt();

        System.out.print("Digite o terceiro lado do triângulo: ");
        int lado3 = scanner.nextInt();

        verificarTipoTriangulo(lado1, lado2, lado3);

        scanner.close();
    }

    public static void verificarTipoTriangulo(int lado1, int lado2, int lado3) {
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Equilátero");  // Os lados todos iguais
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Isósceles"); // O Dois lados iguais
            } else {
                System.out.println("Escaleno"); // Os lados diferentes
            }
        } else {
            System.out.println("VALORES NÃO FORMAM UM TRIÂNGULO");
        }
    }
}

