package Arrays;

public class TreureValorsArray {

    public static void main(String[] args){

      int[] a = {1, 4, 7, 9, 10, 5, 2,9};
      int[] trosA = subArray(a, 3, 7);
      printArray(trosA);
    }

    public static void printArray(int[] array){

        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d. \n", i, array[i]);
        }
    }

    public static int[] subArray(int[] array, int a, int b){
        int[] copia = new int[b-a+1];
        for(int i=a; i<=b; i++){
            copia[i-a] = array[i];
        }
        return copia;
    }
}