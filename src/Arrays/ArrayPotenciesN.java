package Arrays;

import java.util.Scanner;

public class ArrayPotenciesN {

    public static void main(String[] args) {

        int[] a = {1, 4, 7, 9, 10, 5, 3, 2, 9};
        System.out.print("B: ");
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int[] potencies = arrayNPotencies(10, b);
        printArray(potencies);
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d : %d. \n", i, array[i]);
        }
    }

    public static int[] arrayNPotencies(int n, int b) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(b, i + 1);
        }
        return array;
    }
}