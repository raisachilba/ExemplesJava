package Arrays;

public class MatriusIgualsArray {

    public static void main(String[] args) {

        int[][] mA = {
                {1, 4, 7},
                {4, 3, 6},
                {5, 6, 3}
        };
        int[][] mB = {
                {1, 4, 7},
                {4, 3, 6},
                {5, 6, 0}
        };
        System.out.printf("Son les matrius iguales? %b", matriusIguals(mA, mB));
    }

    public static boolean matriusIguals(int[][] m1, int[][] m2){
        for(int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1[i].length; j++){
                if(m1[i][j]!=m2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
