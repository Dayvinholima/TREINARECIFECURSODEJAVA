import java.util.Scanner;

public class Exercicio48{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do paciente: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o peso do paciente (em quilos): ");
        float peso = scanner.nextFloat();

        int dosagem = calcularDosagem(idade, peso);
        int gotasPorDose = calcularGotasPorDose(dosagem);

        System.out.println("Quantidade de gotas por dose: " + gotasPorDose);

        scanner.close();
    }

    public static int calcularDosagem(int idade, float peso) {
        if (idade >= 12) {
            if (peso >= 60) {
                return 1000;
            } else {
                return 875;
            }
        } else {
            if (peso >= 5 && peso <= 9) {
                return 125;
            } else if (peso >= 9.1 && peso <= 16) {
                return 250;
            } else if (peso >= 16.1 && peso <= 24) {
                return 375;
            } else if (peso >= 24.1 && peso <= 30) {
                return 500;
            } else {
                return 750;
            }
        }
    }

    public static int calcularGotasPorDose(int dosagem) {
        // Cada ml corresponde a 20 gotas e 1 ml contém 500 mg do medicamento
        int mlPorDose = dosagem / 500;
        return mlPorDose * 20;
    }
}
