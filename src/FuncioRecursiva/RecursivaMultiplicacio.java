package FuncioRecursiva;

import java.util.Scanner;

public class RecursivaMultiplicacio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        int a = input.nextInt();
        System.out.print("B: ");
        int b = input.nextInt();
        multiplicacioSencers(a,b);
        System.out.printf("El resultat del producte de %d i %d, és %d", a, b, multiplicacioSencers(a,b));
    }
    public static int multiplicacioSencers(int a, int b){
        if (b==0){
            return 0;
        }else{
            return multiplicacioSencers(a, b - 1) + a;
        }
    }
}