public class CalculadoraDeEstoque{

        public static void main(String[] args) {

        double LivroJava = 59.90;
        double LivroPython = 39.90;

        double soma = LivroJava + LivroPython;

        if (soma < 150) {

                System.out.println("O seu caixa está baixo");
        }

        else if(soma >2000){

                System.out.println("seu caixa esta muito alto");}

        else {
                System.out.println("seu caixa está bom");
        }

        }
        
}           





