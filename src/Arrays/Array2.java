package Arrays;

public class Array2 {

    public static void main(String[] args){

        //Definició i creació
        int[] a={3,8,2,11,25};
        int[] b={4,6,8};
        int[] c={3,8,2,11,25,37,22,10,50};


        System.out.printf("La suma de l'array A es %d. ", calculaSuma(a));
        System.out.printf("La suma de l'array B es %d. ", calculaSuma(b));
        System.out.printf("La suma de l'array C es %d. ", calculaSuma(c));
        System.out.printf("La mitjana de l'array A es %d. ", calculaMitjana(a));
        System.out.printf("La mitjana de l'array B es %d. ", calculaMitjana(b));
        System.out.printf("La mitjana de l'array C es %d. ", calculaMitjana(c));

    }

    public static int calculaSuma(int[] array){
        int suma = 0;
        for(int i=0; i<array.length; i++){
            suma = suma + array[i];
        }
        return suma;
    }

    public static int calculaMitjana(int[] array){
        return calculaSuma(array)/array.length;
    }
}
