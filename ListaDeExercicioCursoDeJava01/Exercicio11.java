import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora de início do jogo: ");
        int horaInicial = scanner.nextInt();

        System.out.print("Digite a hora de fim do jogo: ");
        int horaFinal = scanner.nextInt();

        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("A duração do jogo é de " + duracao + " hora(s).");

        scanner.close();
    
}
}
