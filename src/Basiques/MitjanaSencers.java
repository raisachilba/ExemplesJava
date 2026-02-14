package Basiques;

import java.util.Scanner;

public class MitjanaSencers {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter numA: ");
        int numA = input.nextInt();
        System.out.print("Enter numB: ");
        int numB = input.nextInt();
        System.out.print("Enter numC: ");
        int numC = input.nextInt();
        float mitjana = (numA + numB + numC)/3F;
        System.out.println("La mitjana és: "+ mitjana);
    }
}
