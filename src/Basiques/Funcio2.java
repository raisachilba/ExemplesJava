package Basiques;

public class Funcio2 {

    public static void main(String[] args) {

        int x = 10;
        ImprimirNumeros(x);
        ImprimirNumeros(3);

    }

    public static void ImprimirNumeros(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d%n", i);
        }
    }
}
