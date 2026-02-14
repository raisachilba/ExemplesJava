package Arrays;

import java.util.Scanner;

public class MatriusIdentitats {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dimensions array: ");
        int d = input.nextInt();
        MatriusArray.imprimir(matriuIdentitat(d));
    }

    public static int[][] matriuIdentitat(int n){
        int[][] m = new int[n][n];
        for(int i = 0; i < m.length; i++){
            m[i][i] = 1;
        }
        return m;
    }
}