package Arrays;

public class BidimensionalArrayRecorrer {

    public static void main(String[] args) {

        char[][] meuArray = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };

        //Recorregut per columnes
        System.out.printf("Recorregut per columnes: \n");
        for (int c = 0; c < meuArray[0].length; c++) {
            for (int f = 0; f < meuArray.length; f++) {
                System.out.printf("%c\t", meuArray[f][c]);
            }
            System.out.printf("\n");
        }

        //Recorregut per files
        System.out.printf("Recorregut per files: \n");
        for (int f = 0; f < meuArray.length; f++) {
            for (int c = 0; c < meuArray[0].length; c++) {
                System.out.printf("%c\t", meuArray[f][c]);
            }
            System.out.printf("\n");
        }

        //Recorregut en diagonal descendent (Ineficient)
        System.out.printf("Recorregut en diagonal: \n");
        for (int f = 0; f < meuArray.length; f++) {
            for (int c = 0; c < meuArray[0].length; c++) {
                if (f == c) {
                    System.out.printf("%c\t", meuArray[f][c]);
                }
            }
            System.out.printf("\n");
        }

        //Recorregut en diagonal descendent (Eficient)
        System.out.printf("Recorregut en diagonal descendent: \n");
        for (int f = 0; f < meuArray.length; f++) {
            System.out.printf("%c\t", meuArray[f][f]);
            System.out.printf("\n");
        }

        //Recorregut diagonal ascendent
        System.out.printf("Recorregut en diagonal ascendent: \n");
        for (int f = 2, c = 0; f>=0 && c < meuArray.length; f--, c++) {
            System.out.printf("%c\t", meuArray[f][c]);
            System.out.printf("\n");
        }

    }
}