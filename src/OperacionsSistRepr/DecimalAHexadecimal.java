package OperacionsSistRepr;

import java.util.Scanner;

public class DecimalAHexadecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix nombre en decimal: ");
        int nd = input.nextInt();
        String nh = "";
        while(nd != 0){
            int r = nd % 16;
            nd = nd / 16;
            nh = digit2Hexa(r) + nh;
        }
        System.out.printf("El nombre %d en hexadecimal és %s", nd, nh);
    }
    public static String digit2Hexa(int r){
        String c;
        if(r>=0 && r<10){
            c = String.valueOf(r);
        } else if (r == 10) {
            c = "A";
        }else if (r == 11) {
            c = "B";
        }else if (r == 12) {
            c = "C";
        }else if (r == 13) {
            c = "D";
        }else if (r == 14) {
            c = "E";
        }else{
            c = "F";
        }
        return c;
    }
}