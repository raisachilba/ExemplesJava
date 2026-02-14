package Basiques;

import java.util.Scanner;

public class MaxIMin5Num {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<5; i++){
            System.out.print("Número: ");
            int n=input.nextInt();
            if(n>max){max=n;}
            if(n<min){min=n;}
        }
        System.out.printf("El màxim i mínim són respectivametn %d i %d.",max,min);
    }
}