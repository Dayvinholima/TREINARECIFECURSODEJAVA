import java.util.Scanner;

public class Exercicio41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        verificarPesoIdeal(peso, altura);

        scanner.close();
    }

    public static void verificarPesoIdeal(double peso, double altura) {
        double pesoIdeal;

        if (altura <= 1.50) {
            pesoIdeal = 50;
        } else if (altura <= 1.90) {
            pesoIdeal = 70;
        } else {
            pesoIdeal = 100;
        }

        if (peso == pesoIdeal) {
            System.out.println("Parabéns, peso ideal!");
        } else if (peso < pesoIdeal) {
            double diferenca = pesoIdeal - peso;
            System.out.println("Engorde " + diferenca + " Kg");
        } else {
            double diferenca = peso - pesoIdeal;
            System.out.println("Emagreça " + diferenca + " Kg");
        }
    }
}
    

