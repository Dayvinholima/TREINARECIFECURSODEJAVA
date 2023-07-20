import java.util.Scanner;

public class Exercicio44 {  // achei que ficou grande demais!!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
        }

        double mediaImpares = calcularMediaImpares(numeros);
        double maiorPar = encontrarMaiorPar(numeros);
        double diferencaMaiorMenor = calcularDiferencaMaiorMenor(numeros);

        System.out.println("Média dos ímpares: " + mediaImpares);
        System.out.println("Maior número par: " + maiorPar);
        System.out.println("Diferença entre o maior e o menor número: " + diferencaMaiorMenor);

        scanner.close();
    }

    public static double calcularMediaImpares(double[] numeros) {
        double somaImpares = 0;
        int quantidadeImpares = 0;

        for (double numero : numeros) {
            if (numero % 2 != 0) {
                somaImpares += numero;
                quantidadeImpares++;
            }
        }

        return quantidadeImpares == 0 ? 0 : somaImpares / quantidadeImpares;
    }

    public static double encontrarMaiorPar(double[] numeros) {
        double maiorPar = Double.MIN_VALUE;

        for (double numero : numeros) {
            if (numero % 2 == 0 && numero > maiorPar) {
                maiorPar = numero;
            }
        }

        return maiorPar;
    }

    public static double calcularDiferencaMaiorMenor(double[] numeros) {
        double maior = numeros[0];
        double menor = numeros[0];

        for (double numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        return maior - menor;
    }
}
