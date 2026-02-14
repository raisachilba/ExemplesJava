package OperacionsSistRepr;

import java.util.Scanner;

public class DecimalAOctal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix nombre en decimal: ");
        int nd = input.nextInt();
        int no = 0;
        int pot = 1;
        while(nd > 0){
            int r = nd % 8;
            nd = nd / 8;
            no = r * pot + no;
            pot *= 10;
        }
        System.out.printf("El nombre %d en octal és %d", nd, no);
    }
}
