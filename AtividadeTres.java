import java.util.Scanner;

public class AtividadeTres {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        

        System.out.println("Digite os números em ordem para a equação de segundo grau a,b e c.");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        scanner.close();
        if(a == 0 && b ==  0 && c != 0){
            System.out.println("Coeficientes informados incorretamente.");
            return;
        
        }
        double delta = b * b - 4 * a * c;

        if(a == 0 && b != 0 ){
            System.out.println("Essa é uma equação do primeiro grau.");
            double raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
            double raiz2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("As raízes da equação são:");
            System.out.println("raiz1 = " + raiz1);
            System.out.println("raiz2 = " + raiz2);
            return;
        }
        if(delta < 0){
            System.out.println("Esta equação não possui raízes reais");
        }
        if(delta == 0){
            System.out.println("Esta equação possui duas raízes iguais.");
            double raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
            double raiz2 = (-b - Math.sqrt(delta)) / 2 * a;    
            System.out.println("raiz1 = " + raiz1);
            System.out.println("raiz2 = " + raiz2);
        }
        if(delta>0){
            System.out.println("Esta equação possui raízes reais diferentes.");
            double raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
            double raiz2 = (-b - Math.sqrt(delta)) / 2 * a;               
            System.out.println("raiz1 = " + raiz1);
            System.out.println("raiz2 = " + raiz2);

        }
        
        

    }
}
