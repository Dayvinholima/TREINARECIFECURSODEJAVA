import java.util.Arrays;
import java.util.Scanner;

public class Exercicio27 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] medicoes = new int[4];
        int somaMedicoes = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a medição " + (i + 1) + ": ");
            medicoes[i] = scanner.nextInt();
            somaMedicoes += medicoes[i];
        }

        scanner.close();

        Arrays.sort(medicoes);
        
        double media = somaMedicoes / 4.0;
        System.out.println("Glicose média: " + media);
        System.out.println("Classificação das medições:");


        for (int medicao : medicoes) {
            if (medicao >= 80 && medicao <= 109) {
                System.out.println(medicao + ": Normal");
            } else if (medicao >= 110 && medicao <= 117) {
                System.out.println(medicao + ": Alterado");
            } else if (medicao >= 118 && medicao <= 139) {
                System.out.println(medicao + ": Alterado");
            } else {
                System.out.println(medicao + ": Muito Alterado");
            }

            
            
        }
    }
}