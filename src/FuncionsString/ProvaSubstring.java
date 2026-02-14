package FuncionsString;

public class ProvaSubstring {

    public static void main(String[] args) {

        String nomComplet = "Paco Perez Lopez";
        //Cercam la posició del primer espai
        int p1 = nomComplet.indexOf(" ");
        //Cercam la posició del segon espai
        int p2 = nomComplet.lastIndexOf(" ");
        String nom = nomComplet.substring(0,p1);
        String llin1 = nomComplet.substring(p1+1, p2);
        String llin2 = nomComplet.substring(p2+1);
        System.out.printf("%s, %s, %s.", nom, llin1, llin2);
    }
}
