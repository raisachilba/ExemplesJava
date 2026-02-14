package Basiques;

import java.util.Scanner;

public class DivisioDosNumeros {

    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        double D = (double) a / b;
        System.out.println(D);
    }
}
