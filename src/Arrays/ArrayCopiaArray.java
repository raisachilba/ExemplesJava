package Arrays;

public class ArrayCopiaArray {

    public static void main(String[] args){

      int[] a = {1, 4, 7, 9};
      int[] copiaA = copiaArray(a);
      printArray(copiaA);
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
    public static int[] copiaArray(int[] array){
        int[] copia = new int[array.length];
        for(int i=0; i<array.length; i++){
            copia[i] = array[i];
        }
        return copia;
    }
}