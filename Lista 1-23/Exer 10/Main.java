import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        double[] vetor = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número na posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número na posição " + (i + 1) + ": " + vetor[i] + " - ");
            if (vetor[i] > 0) {
                System.out.println("Positivo");
            } else if (vetor[i] < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }
        scanner.close();
    }
}