package Basiques;

import java.util.Scanner;

public class ExemplePrintf {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String nom = input.next();

        System.out.print("Enter your age: ");
        int edat = input.nextInt();

        System.out.print("Enter your weight: ");
        float pes = input.nextFloat();

        System.out.print("Enter your blood family: ");
        char grup = input.next().charAt(0);

        System.out.print("Have you got any allergies? : ");
        boolean alergies = input.nextBoolean();
        System.out.printf("My name is %s. I'm %d years old. My weight is %f." +
                "My blood family is %c. Allergies: %b.", nom, edat, pes, grup, grup, alergies);
    }
}
