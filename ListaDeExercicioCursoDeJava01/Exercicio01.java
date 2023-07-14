import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota teste: ");
        double teste = input.nextDouble();

        System.out.println("Nota da prova: ");
        double prova = input.nextDouble();
        
        input.close();

        double media = (teste * 3.5 + prova * 7.5) / 11; 

        System.out.println("MEDIA = " + media);

        // ACASO QUEIRA DEFINIR A QUANTIDADE DE CASAS DECIMAIS A SEREM MOSTRADA SUBSTITUIR "PRINTLN" por "PRINTF"

        System.out.printf("MEDIA = %.2f", media);

    }
    
}
