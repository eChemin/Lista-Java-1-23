import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da conta: R$ ");
        double valorTotal = scanner.nextDouble();

        System.out.print("Digite o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        double valorPrestacao = 0;
        valorPagamento(valorTotal, numeroParcelas, valorPrestacao);

        System.out.println("O valor da prestação é: R$ " + valorPrestacao);

        scanner.close();
    }

    public static void valorPagamento(double valorTotal, int numeroParcelas, double valorPrestacao) {
        valorPrestacao = valorTotal / numeroParcelas;
    }
}