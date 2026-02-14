package Basiques;

import java.util.Scanner;

import static java.lang.Math.pow;

public class CalculMRUA {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Xo: ");
        double Xo = input.nextDouble();
        System.out.print("Enter Vo: ");
        double Vo = input.nextDouble();
        System.out.print("Enter t: ");
        double t = input.nextDouble();
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        double x = Xo + Vo * t + 1./2 * a * pow(t, 2);
        double v = Vo + a * t;
        System.out.println("La posició serà: "+ x +"."+ " La velocitat serà: "+ v);
    }
}
