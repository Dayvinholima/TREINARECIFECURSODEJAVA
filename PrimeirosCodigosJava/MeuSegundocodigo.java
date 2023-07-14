import java.util.Scanner;

public class MeuSegundocodigo {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        System.out.println("digite sua altura:");
        int altura = sc.nextInt();

        sc.close();

        System.out.println("Você tem " + idade + " anos " + altura + "m de altura:");
        
    }

}
