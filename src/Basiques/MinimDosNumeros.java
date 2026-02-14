package Basiques;

import java.util.Scanner;

public class MinimDosNumeros {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Num1: ");
        int Num1 = input.nextInt();
        System.out.print("Num2: ");
        int Num2 = input.nextInt();
        int variable = (Num1 < Num2) ? Num1 : Num2;

    }
}
