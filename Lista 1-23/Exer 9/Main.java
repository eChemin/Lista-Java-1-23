import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[5];
        double[] numerosClassificados = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        double media = soma / 5;

        for (int i = 0; i < 5; i++) {
            if (numeros[i] < media) {
                numerosClassificados[i] = -1;
            } else if (numeros[i] == media) {
                numerosClassificados[i] = 0; 
            } else {
                numerosClassificados[i] = 1;
            }
        }

        System.out.println("Números digitados:");
        for (int i = 0; i < 5;