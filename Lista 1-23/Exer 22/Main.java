import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo do produto: ");
        float custoProduto = scanner.nextFloat();

        System.out.print("Digite a taxa de imposto sobre vendas (em porcentagem): ");
        int taxaImposto = scanner.nextInt();

        float novoCusto = somaImposto(custoProduto, taxaImposto);
        System.out.println("O novo custo do produto com imposto é: " + novoCusto);

        scanner.close();
    }

    public static float somaImposto(float custoProduto, int taxaImposto) {
        float imposto = custoProduto * taxaImposto / 100;

        float novoCusto = custoProduto + imposto;

        return novoCusto;
    }
}