import java.util.Scanner;

public class Exercicio06 {


    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a distância percorrida: ");
        double X = scanner.nextDouble();

        System.out.println("Litros de gasolina foram gastos: ");
        double Y = scanner.nextDouble();

        scanner.close();

        double consumo = X / Y;

        System.out.println("O gasto de gasolina por KM foi de:  " + consumo);



    }
    
}
