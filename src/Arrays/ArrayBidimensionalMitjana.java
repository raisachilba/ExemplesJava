package Arrays;

public class ArrayBidimensionalMitjana {

    public static void main(String[] args) {

        int[][] mA = {
                {7, 9, 8},
                {2, 5, 4},
                {7, 6, 3}
        };
        System.out.printf("El valor mínim és %d.\n", minimMatriu(mA));
        System.out.printf("El valor maxim és %d.\n", maximMatriu(mA));
        System.out.printf("La mitjana és %f.", mitjanaMatriu(mA));
    }

    public static int minimMatriu(int[][] m) {
        int minim = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < minim) {
                    minim = m[i][j];
                }
            }
        }
        return minim;
    }

    public static int maximMatriu(int[][] m) {
        int maxim = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maxim) {
                    maxim = m[i][j];
                }
            }
        }
        return maxim;
    }
    public static float mitjanaMatriu(int[][] m){
        int suma = 0;
        int num = 9;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                suma +=m[i][j];
            }
        }
        return (float) suma/num;
    }
}