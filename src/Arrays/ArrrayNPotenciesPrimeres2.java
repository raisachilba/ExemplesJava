package Arrays;

public class ArrrayNPotenciesPrimeres2 {

    public static void main(String[] args) {

        int[] a = {1, 4, 7, 9, 10, 5, 3, 2, 9};
        int[] potencies = arrayPotencies2(10);
        printArray(potencies);
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d : %d. \n", i, array[i]);
        }
    }

    public static int[] arrayPotencies2(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(2, i + 1);
        }
        return array;
    }
}