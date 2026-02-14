package Basiques;

import java.util.Scanner;

public class CalculMRU {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Xo: ");
        double Xo = input.nextDouble();
        System.out.print("Enter v: ");
        double v = input.nextDouble();
        System.out.print("Enter t: ");
        double t = input.nextDouble();
        double x = Xo + v * t;
        System.out.println("La posició és: "+x);
    }
}
