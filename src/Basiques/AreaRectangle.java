package Basiques;

import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int b = input.nextInt();
        System.out.print("Enter Altura: ");
        int a = input.nextInt();
        double area = b * a;
        System.out.println(area);
    }
}
