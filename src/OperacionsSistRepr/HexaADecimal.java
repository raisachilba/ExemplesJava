package OperacionsSistRepr;

import java.util.Scanner;

public class HexaADecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix un nombre en hexadecimal: ");
        String nh = input.next();

        int nd = 0;
        int pot = 1;

        for (int i = nh.length() - 1; i >= 0; i--) {
            char c = nh.charAt(i);
            int d = hexa2Digit(c);
            nd += d*pot;
            pot= 16*pot;
        }

        System.out.printf("El nombre %s en decimal és %d", nh, nd);
    }

    public static int hexa2Digit(char c) {
        switch(c){
            case 'A': return 10;
            case 'B': return 11;
            case 'C': return 12;
            case 'D': return 13;
            case 'E': return 14;
            case 'F': return 15;
            default: return Character.getNumericValue(c);
        }
    }
}