package Arrays;

public class ZippearArray {

    public static void main(String[] args) {

        int[] a = {5, 15, 25};
        int[] b = {10, 20, 30};
        ArrayCopiaArray.printArray(zipArrays(a, b));
    }

    public static int[] zipArrays(int[] a, int[] b) {
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[2 * i] = a[i];
            c[2 * i + 1] = b[i];
        }
        return c;
    }
}