public class CalculadoraDeEstoque1 {
    
    public static void main(String[] args){

        double soma = 0;
        int NumLivros = 10;

        int contador = 0; // inicia cotador


        // while (contador)

        while(contador < NumLivros){   //verifica siação
            soma += 59.90;
            contador++;     // incrementação
            
    }
        
        
        


        //for (contador)

        /*for(int i = 0; i < NumLivros ){
            if (i ==2){
                break;
            }

        }

*/


        if (soma < 150) {

        System.out.println("O seu caixa está baixo");
        }

        else if(soma >2000){

            System.out.println("seu caixa esta muito alto");}

        else {
        System.out.println("seu caixa está bom");
        }
        
        
        //conector || ('ou) - Disjunção
        if (soma == 599 || soma == 2*599){
            System.out.println("soma: " + soma);
        }


    }


}
