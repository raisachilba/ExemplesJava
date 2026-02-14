package Basiques;

import java.util.Scanner;

public class FuncioValorAbsolut {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        float f = input.nextFloat();
        float af = absolut(f);
        System.out.printf("El valor absolut de %f és %f", f, af);
    }

    public static float absolut(float n) {
        if (n >= 0) {
            return n;
        } else {
            return -n;
        }
    }
}

