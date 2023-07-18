import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da pessoa em cm: ");
        float altura = scanner.nextFloat();

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        scanner.close();

        int brinquedosPermitidos = 0;

        if (altura >= 150 && idade >= 12) {
            brinquedosPermitidos++;
        }

        if (altura >= 140 && idade >= 14) {
            brinquedosPermitidos++;
        }

        if (altura >= 170 || idade >= 16) {
            brinquedosPermitidos++;
        }

        System.out.println("Número de brinquedos que a pessoa pode andar: " + brinquedosPermitidos);
    }
}
    // saida descrita no exercicio está equivocada

