import java.util.Scanner;

public class Exercicio49 {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do paciente (em kg): ");
        float peso = scanner.nextFloat();

        System.out.print("Digite a altura do paciente (em metros): ");
        float altura = scanner.nextFloat();

        float imc = calcularIMC(peso, altura);
        String situacao = determinarSituacaoIMC(imc);

        System.out.println("IMC = " + imc + " - " + situacao);

        scanner.close();
    }

    public static float calcularIMC(float peso, float altura) {
        return peso / (altura * altura);
    }

    public static String determinarSituacaoIMC(float imc) {
        if (imc < 20) {
            return "Abaixo do peso";
        } else if (imc >= 20 && imc < 25) {
            return "Peso Normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 40) {
            return "Obeso";
        } else {
            return "Obeso Mórbido";
        }
    }
}