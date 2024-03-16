import java.util.Scanner;

public class AtividadeDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para o que deseja comprar: ");
        System.out.println("(1)Salgado  (2)Doce  (3)Suco  (4)Refigerante ");
         double n1 = scanner.nextDouble();

        System.out.println("Qual o valor do item? ");
         double n2 = scanner.nextDouble();
        
        System.out.println("Qual o valor inserido? ");
         double n3 = scanner.nextDouble();

         scanner.close();
    
         double troco = (n3 - n2);
        System.out.println("\ntroco: R$" + troco);


         if (troco < n2) {
            System.out.println("Valor inserido é insuficiente.");
            return;
         }

         int[] tipo = {50,20,10,5,2,1};
            for(int tipos:tipo) {
                int tipo2 = (int) troco/tipos;
                System.out.println("\nNota(s) R$"+ tipos + ": " + tipo2);
            troco = troco - (tipo2 * tipos);
            }

        

    }
}
