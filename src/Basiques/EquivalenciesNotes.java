package Basiques;

import java.util.Scanner;

public class EquivalenciesNotes {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Nota: ");
        double nota = input.nextDouble();

        if (nota >=0 && nota <5){
            System.out.println("Suspés");
        }else if (nota >=5 && nota <6) {
            System.out.println("Suficient");
        }else if (nota >=6 && nota <7) {
            System.out.println("Bé");
        }else if (nota >=7 && nota <9){
            System.out.println("Notable");
        }else if (nota >=9 && nota <10) {
            System.out.println("Excel·lent");
        }else if (nota <0 || nota> 10){
            System.out.println("Nota no vàlida");
        }
    }
}
