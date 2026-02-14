package OperacionsSistRepr;

import java.util.Scanner;

public class BinariADecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix nombre en binari: ");
        int n = input.nextInt();
        int dec = 0;
        int pot = 1;
        while(n > 0){
            int d = n % 10;
            dec = dec + d * pot;
            pot = pot * 2;
            n = n / 10;
        }
        System.out.printf("El nombre %d en decimal és %d", n, dec);
    }
}
