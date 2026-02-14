package Basiques;

import java.util.Scanner;

public class ConversioTemperatures2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter ºC: ");
        double grausC = input.nextDouble();
        double grausF = ((grausC * 9. / 5) + 32);
        System.out.println("La temperatura en ºF és " + grausF);
    }
}
