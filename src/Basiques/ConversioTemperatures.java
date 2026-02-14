package Basiques;

import java.util.Scanner;

public class ConversioTemperatures {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ºF: ");
        double grausF = input.nextDouble();
        double grausC = 5./9 * (grausF - 32);
        System.out.println("La temperatura en ºC és "+grausC);
    }
}
