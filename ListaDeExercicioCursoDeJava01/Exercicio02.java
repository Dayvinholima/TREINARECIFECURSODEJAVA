import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero do funcionario:");
        int Funcionario = (int)sc.nextDouble();

        System.out.println("Horas trabalhadas");
        double QtdHoras = sc.nextDouble();

        double ValorHora = 5.50;

        double Salario = (QtdHoras * ValorHora);
        
        sc.close();
        
        System.out.println("Funcionário: " +  Funcionario  +  " recebe de salario: " + Salario);

    }
    
    
}
