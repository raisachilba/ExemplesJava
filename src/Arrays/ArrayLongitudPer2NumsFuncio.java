package Arrays;

public class ArrayLongitudPer2NumsFuncio {

    public static void main(String[] args){

      printArray(numsArray(2,7));
    }
    public static int[] numsArray(int a, int b){

        //Creació de l'array
        int[] array = new int [b-a+1];
        for(int i=0; i<array.length; i++){
            array[i] = a + i;
        }
        return array;
    }
    public static void printArray(int[] array){

        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d. \n", i, array[i]);
        }
    }
}
