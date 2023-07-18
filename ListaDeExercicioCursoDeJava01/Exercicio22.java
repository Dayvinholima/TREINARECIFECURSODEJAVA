import java.util.Scanner;

public class Exercicio22 {
    
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o consumo de água da residência em m3: ");
        int consumo = scanner.nextInt();

        scanner.close();

        double valorConta = 7.0; // Valor da assinatura básica

        if (consumo <= 10) {
            // O consumo está incluído na franquia, não é cobrado adicional
        } else if (consumo <= 30) {
            valorConta += (consumo - 10) * 1.0; // Preço por m3 na faixa de 11 a 30 é R$ 1
        } else if (consumo <= 100) {
            valorConta += 20 + (consumo - 30) * 2.0; // Preço por m3 na faixa de 31 a 100 é R$ 2
        } else {
            valorConta += 20 + 140 + (consumo - 100) * 5.0; // Preço por m3 acima de 100 é R$ 5
        }

        System.out.println("Valor em Reais: " + String.format("%.2f", valorConta));
    }
}