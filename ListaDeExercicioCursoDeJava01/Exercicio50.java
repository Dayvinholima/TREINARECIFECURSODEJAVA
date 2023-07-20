import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de casos de teste: ");
        int casosTeste = scanner.nextInt();

        for (int i = 0; i < casosTeste; i++) {
            System.out.print("Digite o número do andar: ");
            long andar = scanner.nextLong();

            long numeroAtribuido = encontrarNumeroAtribuido(andar);
            System.out.println(numeroAtribuido);
        }

        scanner.close();
    }

    public static long encontrarNumeroAtribuido(long andar) {
        long numeroAtual = 1;

        while (andar > 0) {
            if (!contemDigito4OuSequencia13(numeroAtual)) {
                andar--;
            }
            numeroAtual++;
        }

        return numeroAtual - 1;
    }

    public static boolean contemDigito4OuSequencia13(long numero) {
        String numeroStr = String.valueOf(numero);
        return numeroStr.contains("4") || numeroStr.contains("13");
    }
}