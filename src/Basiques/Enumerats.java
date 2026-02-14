package Basiques;

public class Enumerats {

    static enum EstatCivil {SOLTER, CASAT, DIVORCIAT};
    static enum Estudis {CAP, ESO, BATXILLER, FP};
    static enum Sexe {HOME, DONA};
    static enum EstatLaboral {ESTUDIA, TREBALLA, ATUR};

    public static void main(String[] args){

        Sexe a = Sexe.HOME;
        Sexe b = Sexe. DONA;
        EstatCivil c = EstatCivil.SOLTER;
        EstatLaboral d = EstatLaboral.ESTUDIA;
        Estudis e = Estudis.BATXILLER;

        System.out.println(a+"," +b+"," +c+"," +d+"," +e+".");
    }
}
