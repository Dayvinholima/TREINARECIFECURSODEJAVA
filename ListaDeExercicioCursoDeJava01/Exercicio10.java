import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws Exception {
        Scanner input =  new Scanner(System.in);
        
        
        System.out.println("Dias vivido");
        int diasDevida = input.nextInt();

        input.close();

        int anos = diasDevida / 365;
        int mes = (diasDevida % 365) / 30;
        int dias = (diasDevida % 365) % 30;


        System.out.printf("Tempo convertido: %02d ano: %02d mes(es): %02d dia(s)", anos, mes, dias);  ;

        
    }
    
}
