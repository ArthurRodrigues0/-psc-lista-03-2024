import java.util.Scanner;

public class Atividadeum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double n3 = scanner.nextDouble();
    

        double r1 = Math.max(n1, Math.max(n2, n3));
        double r2 = Math.min(n1, Math.min(n2, n3));
        double r3 = (n1 + n2 + n3) /3;

        System.out.println("O maior numero é " + r1);
        System.out.println("O menor numero é " + r2);
        System.out.println("A média dos numeros são " + r3);

        scanner.close();
  
    }
}