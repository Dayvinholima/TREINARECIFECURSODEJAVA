import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        System.out.print("Digite a terceira palavra: ");
        String palavra3 = scanner.nextLine();

        scanner.close();

        String animal ;

        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnívoro")) {
                    animal = "águia";
                } else if (palavra3.equals("onívoro")) {
                    animal = "pomba";
                }
            } else if (palavra2.equals("mamífero")) {
                if (palavra3.equals("onívoro")) {
                    animal = "homem";
                } else if (palavra3.equals("herbívoro")) {
                    animal = "vaca";
                }
            }
        } else if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematófago")) {
                    animal = "pulga";
                } else if (palavra3.equals("herbívoro")) {
                    animal = "lagarta";
                }
            } else if (palavra2.equals("anelídeo")) {
                if (palavra3.equals("onívoro")) {
                    animal = "minhoca";
                } else if (palavra3.equals("hematófago")) {
                    animal = "sanguessuga";
                
                }
            
            }
        
        
        }

        System.out.printf("O animal correspondente é: " + animal);

        
    }
}

