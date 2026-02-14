package Arrays;

public class Array1 {

    public static void main(String[] args) {

        //Definició i creació
        String[] noms = {"Paco", "Pep", "Bel", "Jaume"};

        noms[0] = "Xisco";

        //Recorregut Ascendent
        for (int i = 0; i < noms.length; i++) {
            System.out.printf("%s.\n", noms[i]);
        }
            //Recorregut Descendent
            for (int n = noms.length - 1; n >= 0; n--) {
                System.out.printf("%s.\n", noms[n]);
            }
    }
}