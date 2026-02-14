package FuncioRecursiva;

import java.util.Scanner;

public class RecursivaParsImpars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int n = input.nextInt();
        par(n);
        impar(n);
        System.out.printf("EL número es par = %b i impar = %b.", par(n), impar(n));
    }
    public static boolean par(int n){
        if (n==0){
            return true;
        }else{
            return impar(n-1);
        }
    }
    public static boolean impar(int n){
        if (n==0){
            return false;
        }else{
            return par(n-1);
        }
    }
}
