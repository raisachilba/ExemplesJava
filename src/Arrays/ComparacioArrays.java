package Arrays;

public class ComparacioArrays {

    public static void main(String[] args){

      int[] a = {1, 4, 7, 9, 10, 5, 3, 2, 9};
    }
    public static void printArray(int[] array){

        for(int i=0; i<array.length; i++){
            System.out.printf("%d : %d. \n", i, array[i]);
        }
    }

    public static boolean arraysIguals(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }else{
            for(int i=0; i<a.length; i++){
                if(a[i] != b[i]){
                    return false;
                }
            }
            return true;
        }
    }
}