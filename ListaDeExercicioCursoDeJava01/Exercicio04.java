import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite Primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("digite segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.println("digite terceiro valor: ");
        int valor3 = scanner.nextInt();

        int MaiorValor = Math.max(Math.max(valor1, valor2), valor3);
        int Menorvalor = Math.min(Math.min(valor1, valor2), valor3);

        scanner.close();

        System.out.println("O maior valor é: " + MaiorValor + "  e menor valor é: " +  Menorvalor);



    
}
}
