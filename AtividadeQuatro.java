import java.util.Scanner;

public class AtividadeQuatro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double op;
        double n1;

        System.out.println("Digite 1 para calcular o perímetro do círculo, 2 para área do círculo \ne 3 para volume da esfera: ");
        op = scanner.nextDouble();

        System.out.println("Informe o raio: ");
        n1 = scanner.nextDouble();
        
        if(op != 1 && op != 2 && op !=3){
            System.out.println("O código da operação é invalido.");
        }
        if(op == 1){
            System.out.println("O perímetro do círculo é:" + 2 * Math.PI * n1);
        }
        if(op == 2){
            System.out.println("A área do círculo é: "+ Math.PI * (n1*n1));
        }
        if(op == 3){
            System.out.println("O volume da esfera é: "+ (4.0/3.0) * Math.PI *(n1*n1*n1));
        }


        scanner.close();
    }
    
}

