package Arrays;

public class MatriusArray {

    public static void main(String[] args) {

        int[][] matriuA = {
                {2 , 3, 4},
                {1,  0, 5}
        };
        int[][] matriuB = {
                {4 , 0, 1},
                {3,  2, 0}
        };

        System.out.printf("\nSuma matrius: \n");

        int[][] matriuS = sumaMatrius(matriuA, matriuB);
        imprimir(matriuS);

        int[][] matriuC = {
                {2, 4, 5},
                {1, 7, 3},
                {0, 5, 1}
        };

        System.out.printf("\nProducte Escalar: \n");
        int[][] mp = producteEscala(3, matriuC);
        imprimir(mp);
    }

    public static int[][] sumaMatrius(int[][] a, int[][] b){
        int[][] s = new int[a.length][a[0].length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                s[i][j] = a[i][j] + b[i][j];
            }
        }
        return s;
    }

    public static void imprimir(int[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static int[][] producteEscala(int k, int[][] m){
        int[][] p = new int[m.length][m[0].length];
        for(int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                p[i][j] = k * m[i][j];
            }
        }
        return p;
    }
}