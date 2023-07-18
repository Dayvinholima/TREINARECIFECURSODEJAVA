import java.util.Scanner;

public class Exercicio16 {
    
    public static void main(String[] args) {
    
    
        Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a população do país A: ");
    double popA = scanner.nextDouble();

    System.out.print("Digite a população do país B (maior ou igual à população do país A): ");
    double popB = scanner.nextDouble();

        scanner.close();

    if (popB <= popA) {
        System.out.println("A população do país B deve ser maior que a do país A.");
        return;
    }

    int anos = 0;

    while (popA <= popB) {
        popA *= 1.03; // Taxa de crescimento de 3% ao ano para o país A
        popB *= 1.015; // Taxa de crescimento de 1,5% ao ano para o país B
        anos++;
    }

    System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a do país B.");
    
    }

}