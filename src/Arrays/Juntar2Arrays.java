package Arrays;

public class Juntar2Arrays {

    public static void main(String[] args) {

        int[] a = {2, 3, 7, 9, 11};
        int[] b = {6, 8, 2, 4};

        ArrayLongitudPer2NumsFuncio.printArray(ajuntarArrays(a,b));
    }
    public static int[] ajuntarArrays(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for(int i = 0; i < b.length; i++){
            c[i + a.length] = b[i];
        }
        return c;
    }
}
