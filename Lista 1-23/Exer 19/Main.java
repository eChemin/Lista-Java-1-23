public class Main {
    public static void main(String[] args) {
        desenharRetangulo(5, 10);
    }

    public static void desenharRetangulo(int linhas, int colunas) {
        if (linhas < 1 || colunas < 1) {
            System.out.println("Linhas e colunas devem ser no mínimo 1.");
            return;
        }

        desenharLinhaSuperior(colunas);

        for (int i = 1; i < linhas - 1; i++) {
            desenharLinhaIntermediaria(colunas);
        }
        desenharLinhaSuperior(colunas);
    }

    private static void desenharLinhaSuperior(int colunas) {
        System.out.print("+");
        for (int i = 0; i < colunas - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    private static void desenharLinhaIntermediaria(int colunas) {
        System.out.print("|");
        for (int i = 0; i < colunas - 2; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}