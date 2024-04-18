import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        imprimirNumerosAte(numero);

        scanner.close();
    }

    public static void imprimirNumerosAte(int numero) {
        for (int i = 1; i <= numero; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}