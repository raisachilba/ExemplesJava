package Basiques;

import java.util.Scanner;

public class MaximDosNumeros {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Num1: ");
        int NumA = input.nextInt();
        System.out.print("Num2: ");
        int NumB = input.nextInt();
        int MAX = 0;
        if(NumA < NumB) {
            MAX = NumB;
            System.out.println("El màxim dels dos números es "+ MAX);
        }else{
            MAX = NumA;
            System.out.println("El màxim dels dos números es "+ MAX);
        }
    }

}
