package Arrays;

public class InvertirArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        ArrayCopiaArray.printArray(invertirArray(a));
    }

    public static int[] invertirArray(int[] array) {

        int[] invertit = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertit[array.length - i - 1] = array[i];
        }
        return invertit;
    }
}