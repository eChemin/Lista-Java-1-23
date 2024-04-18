public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.print("Digite o 1º número: ");
        vetor[0] = scanner.nextInt();

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Número inválido. O número deve ser maior que o anterior.");
                i--; // Para permitir que o usuário insira o número novamente
            }
        }
        System.out.println("Vetor preenchido:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vetor[i]);
        }

        scanner.close();
    }
}