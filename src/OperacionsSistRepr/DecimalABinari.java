package OperacionsSistRepr;

import java.util.Scanner;

public class DecimalABinari {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix nombre en decimal: ");
        int nO = input.nextInt();

        int baseOrigen = 10;
        int baseDesti = 2;

        int nd = 0;
        int pos = 0;
        int pot = 1;
        while(nO > 0){
            int d = nO % baseDesti;
            nO = nO / baseDesti;
            nd = nd + d * pot;
            pos = pos +1;
            pot = pot * baseOrigen;
        }
        System.out.printf("El nombre %d en decimal és el %d en binari", nO, nd);
    }
}
