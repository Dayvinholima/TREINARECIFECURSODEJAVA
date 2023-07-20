public class Exercicio35 {

    public static void main(String[] args) {
        double S = calcularS();
        System.out.println("O valor de S é: " + S);
    }

    public static double calcularS() {
        double S = 0;
        double denominador = 1;

        for (int numerador = 1; numerador <= 39; numerador += 2) {
            S += numerador / denominador;
            denominador *= 2;
        }

        return S;
    }
}
/*Nesse problema, você deve escrever um programa para calcular e imprimir o valor de S, 
onde S é a soma de uma série definida pela fórmula:
S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?
Para calcular S, você precisa somar uma sequência de frações, começando com 1 e, em seguida, 
adicionando 3/2, 5/4, 7/8 e assim por diante até o último termo 39/?.
A entrada do problema é simplesmente a série descrita pela fórmula, não há necessidade de input do usuário. 
A série termina com um "?" como denominador. O objetivo é calcular a soma e imprimir o valor de S como saída.
*/
