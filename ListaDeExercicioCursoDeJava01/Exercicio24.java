import java.util.Scanner;

public class Exercicio24 {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 5 algarismos: ");
        int numero = scanner.nextInt();

        scanner.close();

        String numeroStr = Integer.toString(numero);

        boolean palindromo = true;
        int tamanho = numeroStr.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (numeroStr.charAt(i) != numeroStr.charAt(tamanho - i - 1)) {
                palindromo = false;
                break;
            }
        }

        System.out.println(palindromo ? "S" : "N");
    }
}
