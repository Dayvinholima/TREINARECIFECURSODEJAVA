import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        int valorCompra = scanner.nextInt();

        System.out.print("Digite o valor pago pelo cliente: ");
        int valorPago = scanner.nextInt();

        verificarTroco(valorCompra, valorPago);

        scanner.close();
    }

    public static void verificarTroco(int valorCompra, int valorPago) {
        int troco = valorPago - valorCompra;

        if (troco >= 2 && troco <= 100) {
            // Verifica se é possível devolver o troco usando duas notas disponíveis
            if (troco % 2 == 0 || troco % 5 == 0 || troco % 10 == 0 || troco % 20 == 0 || troco % 50 == 0 || troco % 100 == 0) {
                System.out.println("possível");
                return;
            }
        }

        System.out.println("impossível");
    }
}
