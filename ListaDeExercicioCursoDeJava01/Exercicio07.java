import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("digite um valor:  ");
        int valor = input.nextInt();

        input.close();
        // existe alguma forma de coloca num array e calcular todos ???
        
        int notas100 = valor / 100;
        valor %= 100;

        int notas50 = valor / 50;
        valor %= 50;

        int notas20 = valor / 20;
        valor %= 20;

        int notas10 = valor / 10;
        valor %= 10;

        int notas5 = valor / 5;
        valor %= 5;

        int notas2 = valor / 2;
        valor %= 2;

        int notas1 = valor;

        System.out.println("Valor lido: " + (notas100 * 100 + notas50 * 50 + notas20 * 20 +
                notas10 * 10 + notas5 * 5 + notas2 * 2 + notas1));
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);
        System.out.println("Notas de 2: " + notas2);
        System.out.println("Notas de 1: " + notas1);

    }

    


}


    

