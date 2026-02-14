package Arrays;

import java.util.Scanner;

public class ArrayInicialSenseValors {

    public static void main(String[] args){

        //Declaració
        double[] nums;
        Scanner input = new Scanner(System.in);
        System.out.print("Num caselles: ");
        int n = input.nextInt();

        //Construcció
        nums = new double[n];

        //Emplenar amb valors aleatoris entre 1 i 100
        for(int i=0; i<nums.length; i++){
            nums[i]= Math.random()*100;
        }

        //Imprimir contingut de l'array
        for(int i=0; i<nums.length; i++){
            System.out.printf("%f.\n", nums[i]);
        }
    }
}
