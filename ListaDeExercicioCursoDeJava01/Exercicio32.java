import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tipoCombustivel;
        float litrosAlcool = 0;
        float litrosGasolina = 0;
        float litrosDiesel = 0;
        int[] clientesPorTipoCombustivel = new int[3]; // Array para armazenar a quantidade de clientes por tipo de combustível.

        for (int i = 1; i <= 5; i++) {
            System.out.println("Abastecimento " + i + ":");
            System.out.println("Digite o tipo de combustível (1. Álcool / 2. Gasolina / 3. Diesel):");
            tipoCombustivel = scanner.nextInt();
            System.out.println("Digite a quantidade de litros abastecidos:");
            int litrosAbastecidos = scanner.nextInt();

            switch (tipoCombustivel) {
                case 1:
                    litrosAlcool += litrosAbastecidos;
                    clientesPorTipoCombustivel[0]++; // Incrementa o contador de clientes de Álcool.
                    break;
                case 2:
                    litrosGasolina += litrosAbastecidos;
                    clientesPorTipoCombustivel[1]++; // Incrementa o contador de clientes de Gasolina.
                    break;
                case 3:
                    litrosDiesel += litrosAbastecidos;
                    clientesPorTipoCombustivel[2]++; // Incrementa o contador de clientes de Diesel.
                    break;
                default:
                    System.out.println("Tipo de combustível inválido. Tente novamente.");
                    i--; // Decrementa o contador para repetir a entrada inválida.
            }
        }

        System.out.println("Quantidade total de litros abastecidos:");
        System.out.println("Álcool: " +  clientesPorTipoCombustivel[0] + " - Qtd litros: " + litrosAlcool  );
        System.out.println("Gasolina: " +  clientesPorTipoCombustivel[1] + " - Qtd litros: " +litrosGasolina  );
        System.out.println("Diesel: " +  clientesPorTipoCombustivel[2] + " - Qtd litros: " + litrosDiesel  );

        /* int combustivelPreferido = determinarPreferenciaCombustivel(litrosAlcool, litrosGasolina, litrosDiesel);
        System.out.println("O combustível preferido dos clientes é o tipo " + combustivelPreferido);*/

        scanner.close();
    }

    /*// Método para determinar o combustível preferido com base na quantidade total de litros abastecidos.
    private static int determinarPreferenciaCombustivel(float litrosAlcool, float litrosGasolina, float litrosDiesel) {
        if (litrosAlcool > litrosGasolina && litrosAlcool > litrosDiesel) {
            return 1;
        } else if (litrosGasolina > litrosAlcool && litrosGasolina > litrosDiesel) {
            return 2;
        } else if (litrosDiesel > litrosAlcool && litrosDiesel > litrosGasolina) {
            return 3;
        } else {
            return 0; // Empate ou todas as quantidades são iguais.
        }
    }*/
}