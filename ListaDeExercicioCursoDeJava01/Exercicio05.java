import java.util.Arrays;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite Primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.println("digite segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.println("digite terceiro valor: ");
        int valor3 = scanner.nextInt();


        // Não esquecer de finalizar o escanner.
        scanner.close();


        // Armazena os valores em um array
        int[] valores = { valor1, valor2, valor3 };

        //  "sort" Ordena o array em ordem crescente
        Arrays.sort(valores);

        System.out.println("Valores em ordem crescente: ");
        for (int valor : valores) {
            System.out.println(valor);




        }
    }
    
}
