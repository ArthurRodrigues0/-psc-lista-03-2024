import java.util.Scanner;

public class AtividadeCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1,n2;
        char op;

        System.out.println("Digite os números necessários para fazer a operação. ");
            n1 = scanner.nextDouble();
            n2 = scanner.nextDouble();

        System.out.println("Escolha uma dentre das operações sendo elas:\n + , - , * , / ou ^).");
            op = scanner.next().charAt(0);

            scanner.close();
            
            if(op != '+' && op != '-' && op != '*' && op != '/' && op != '^' ){
                System.out.println("Operação inválida");
                return;
            }
            if(op == '+'){
                System.out.println("O resultado dessa operação é: "+ (n1+n2));
            }
            if(op == '-'){
                System.out.println("O resultado dessa operação é: "+ (n1-n2));
            }
            if(op == '*'){
                System.out.println("O resultado dessa operação é: "+ (n1*n2));
            }
            if(op == '/'){
                System.out.println("O resultado dessa operação é: "+ (n1/n2));
            }
            if(op == '^'){
                System.out.println("O resultado dessa operação é: "+ Math.pow(n1,n2));
            }
                

    }
}
