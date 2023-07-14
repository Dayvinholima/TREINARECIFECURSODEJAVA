import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do funcionario: ");
        String nome = sc.next();

        System.out.println("Informe salario fixo::");
        double salario = sc.nextDouble();

        System.out.println("Infome total de vendas: ");
        double VendasTotal = sc.nextDouble();

        double SalarioMes = (salario + (VendasTotal * 0.15) );

        sc.close();

        System.out.println(nome + "recebera de proventos " + SalarioMes);


    }

}