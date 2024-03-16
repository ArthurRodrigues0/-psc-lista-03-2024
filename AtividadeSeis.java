import java.util.Random;
import java.util.Scanner;

public class AtividadeSeis {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random sorteio = new Random();
        int n1,n2;
        
        System.out.println("Digite dois números de sua escolha: ");
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();

            scanner.close();

            int maior = Math.max(n1, n2);
            int menor = Math.min(n1, n2);
            int numeroSorteado = sorteio.nextInt(maior - menor)+menor;
            
            System.out.printf("Número sorteado: "+ numeroSorteado);

        if(numeroSorteado %2 == 0){
            System.out.println("\nÉ um número par");
        }
        if(numeroSorteado %2 == 1){
        System.out.println("\nÉ um número ímpar");
        }
    }
}
