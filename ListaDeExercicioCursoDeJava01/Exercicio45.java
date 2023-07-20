import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeMaisNova = null;
        float maiorIdade = Float.MIN_VALUE;
        float somaIdades = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.next();

            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            float idade = scanner.nextFloat();

            // Atualiza a maior idade
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            // Verifica se é a pessoa mais nova e atualiza o nome
            if (nomeMaisNova == null || idade < Float.parseFloat(nomeMaisNova.split(",")[1])) {
                nomeMaisNova = nome + "," + idade;
            }

            // Soma as idades para calcular a média
            somaIdades += idade;
        }

        float mediaIdades = somaIdades / 5;

        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Nome da pessoa mais nova: " + nomeMaisNova.split(",")[0]);
        System.out.println("Média das idades: " + mediaIdades);

        scanner.close();
    }
}
