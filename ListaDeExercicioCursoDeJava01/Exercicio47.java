public class Exercicio47 {
    public static void main(String[] args) {
        int quantidadeTermos = 20;

        for (int i = 0; i < quantidadeTermos; i++) {
            int termo = (int) Math.pow(3, i);
            System.out.print(termo);

            // Imprime uma vírgula e um espaço para separar os termos, exceto no último
            if (i < quantidadeTermos - 1) {
                System.out.print(", ");
            }
        }
    }
}

