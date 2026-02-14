package Projectes;

public class ProbabilitatDaus {

    public static void main(String[] args) {
        // Configuració dels experiments
        int[] experiments = {100, 1000, 1000000};
        float[][] probabilitats = new float[experiments.length][6];

        // Realitzar experiments i calcular probabilitats
        for (int i = 0; i < experiments.length; i++) {
            int[] oc = comptarOcurrencies(experiments[i]);
            calcularProbabilitats(oc, probabilitats[i], experiments[i]);

            // Imprimir resultats de l'experiment
            System.out.printf("Experiment amb %d tirades: ", experiments[i]);
            imprimirArrayEnter("Ocurrències", oc);
            imprimirArrayFloat("Probabilitats", probabilitats[i]);
            System.out.println();
        }

        // Imprimir resultats finals
        System.out.println("Resultats finals de les probabilitats: ");
        for (int i = 0; i < experiments.length; i++) {
            System.out.printf("Experiment amb %d tirades \n", experiments[i]);
            imprimirArrayFloat("Probabilitats: \n", probabilitats[i]);
        }
    }

    // Funció per comptar les ocurrències de cada cara del dau
    public static int[] comptarOcurrencies(int numTirades) {
        int[] oc = new int[6];
        for (int j = 0; j < numTirades; j++) {
            int caraAleatoria = 1 + (int) (Math.random() * 6);
            oc[caraAleatoria - 1]++;
        }
        return oc;
    }

    // Funció per calcular les probabilitats de cada cara
    public static void calcularProbabilitats(int[] oc, float[] prob, int numTirades) {
        for (int cara = 0; cara < 6; cara++) {
            prob[cara] = (float) oc[cara] / numTirades;
        }
    }

    // Funció per imprimir un array d'enters
    public static void imprimirArrayEnter(String label, int[] array) {
        System.out.print(label + ": [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    // Funció per imprimir un array de floats
    public static void imprimirArrayFloat(String label, float[] array) {
        System.out.print(label + ": [");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.6f%s", array[i], (i < array.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}