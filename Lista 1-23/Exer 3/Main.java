import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valores originais: A = " + A + ", B = " + B);
        System.out.println("Valores trocados: A = " + A + ", B = " + B);

        scanner.close();
    }
}