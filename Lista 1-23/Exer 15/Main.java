import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[12];

        System.out.println("Digite os 12 elementos do vetor:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento: ");
            vetor[i] = scanner.nextInt();
        }

        int produto = 1;

        for (int i = 0; i < 12; i++) {
            if (vetor[i] != 0 && vetor[i] % 2 == 0 && vetor[i] > 0) {
                produto *= vetor[i];
            }
        }
        System.out.println("O produto dos elementos pares positivos é: " + produto);

        scanner.close();
    }
}