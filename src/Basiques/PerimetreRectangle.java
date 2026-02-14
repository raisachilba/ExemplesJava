package Basiques;

import java.util.Scanner;

public class PerimetreRectangle {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter altura: ");
        double altura = input.nextDouble();
        double perimetre = ((2 * base) + (2 * altura));
        System.out.println("El perímetre del rectangle és "+perimetre);
    }
}
