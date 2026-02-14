package Basiques;

import java.util.Scanner;

public class PorterDiscotecaAct12 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Edat? ");
        int Edat = input.nextInt();
        if (Edat < 18) {
            System.out.println("No pots entrar a la discoteca.");
        }else{
            System.out.println("Et donam la benvinguda a la discoteca.");
        }
    }
}
