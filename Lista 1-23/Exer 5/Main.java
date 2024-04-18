import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double B = scanner.nextDouble();

        if (A == B) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            System.out.println("O maior número é: " + (A > B ? A : B));
        }

        scanner.close();
    }
}