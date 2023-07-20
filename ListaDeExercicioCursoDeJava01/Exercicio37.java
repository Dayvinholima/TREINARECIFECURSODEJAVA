import java.util.Scanner;

public class Exercicio37 {
    
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do jogador 1 (nome escolha numero): ");
        String jogador1 = scanner.next();
        String escolha1 = scanner.next();
        int numero1 = scanner.nextInt();

        System.out.println("Digite os dados do jogador 2 (nome escolha numero): ");
        String jogador2 = scanner.next();
        String escolha2 = scanner.next();
        int numero2 = scanner.nextInt();

        String vencedor = calcularVencedor(jogador1, escolha1, numero1, jogador2, escolha2, numero2);
        System.out.println("O vencedor é: " + vencedor);

        scanner.close();
    }

    public static String calcularVencedor(String jogador1, String escolha1, int numero1,
                                         String jogador2, String escolha2, int numero2) {
        if (escolha1.equals(escolha2)) {
            return "Ambos fizeram a mesma escolha"; // Ambos escolheram a mesma opção, não há vencedor.
        }

        int soma = numero1 + numero2;
        boolean somaPar = soma % 2 == 0;

        if ((escolha1.equals("PAR") && somaPar) || (escolha2.equals("PAR") && !somaPar)) {
            return jogador1;
        } else {
            return jogador2;
        }
    }
}






