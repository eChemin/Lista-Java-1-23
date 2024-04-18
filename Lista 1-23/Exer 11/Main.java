import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        double[] vetorOriginal = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número na posição " + (i + 1) + ": ");
            vetorOriginal[i] = scanner.nextDouble();
        }

        double[] vetorDobro = new double[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorDobro[i] = vetorOriginal[i] * 2;
        }

        System.out.println("Valores do segundo vetor (dobro dos números do primeiro vetor):");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetorDobro[i]);
        }

        scanner.close();
    }
}