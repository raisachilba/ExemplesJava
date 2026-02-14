package Basiques;

public class Funcio3 {

    public static void main(String[] args) {

        int x = 10;
        ImprimirNumeros(2, x);
        ImprimirNumeros(x, 20);
        ImprimirNumeros(0, 5);

    }

    public static void ImprimirNumeros(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.printf("%d%n", i);
        }
    }
}
