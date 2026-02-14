package Arrays;

import java.util.Scanner;

public class ArrayLongitudPer2Nums {

    public static void main(String[] args){

        //Declaració
        int[] nums;

        Scanner input = new Scanner(System.in);
        System.out.print("Num A: ");
        int a = input.nextInt();

        System.out.print("Num B: ");
        int b = input.nextInt();

        //Construcció
        nums = new int[b-a+1];

        //Emplenar amb valors entre A I B
        for(int i=0; i<nums.length; i++){
            nums[i] = a + i;
        }

        //Imprimir contingut de l'array
        for(int i=0; i<nums.length; i++){
            System.out.printf("%d.\n", nums[i]);
        }
    }
}
