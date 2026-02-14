package Basiques;

import java.util.Scanner;

public class MitjanaAritmeticaSencers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float suma=0;
        int c=0;
        do {
            System.out.print("Número: ");
            int n =input.nextInt();
            if(n==0){
                break;
            }
            suma +=n;
            c++;
        }while(true);
        System.out.printf("La mitjana dels números és %f.", suma/c);
    }
}