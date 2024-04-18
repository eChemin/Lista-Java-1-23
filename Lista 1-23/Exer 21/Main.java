import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        imprimirNumerosEmSequencia(numero);

        scanner.close();
    }
    public static void imprimirNumerosEmSequencia(int numero) {
        int contador = 1;
        for (int i = 1; i <= numero; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(contador + " ");
                contador++;
            }
            System.out.println();
        }
    }
}