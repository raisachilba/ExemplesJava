package Basiques;

import java.util.Scanner;

public class CalculForces {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter massa: ");
        double m = input.nextDouble();
        System.out.print("Enter acceleració: ");
        double a = input.nextFloat();
        double F = m * a;
        System.out.println("La força és de: "+F);
    }
}
