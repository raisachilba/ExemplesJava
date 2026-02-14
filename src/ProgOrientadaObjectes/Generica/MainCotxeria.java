package ProgOrientadaObjectes.Generica;

public class MainCotxeria {

    public static void main(String[] args) {

        //Si hi ha una clase creada per exemple, public class Cotxe{}, es podria fer Cotxeria<Cotxe>
        Cotxeria<String> cs;
        Cotxeria<Cotxe> cc;
        Cotxeria<Bici> cb;

        cs = new Cotxeria<>();
        cc = new Cotxeria<>();
        cb = new Cotxeria<>();

        cc.aparcaPlaça1(new Cotxe("3456CC"));
        cc.aparcaPlaça2(new Cotxe("7564CZ"));
    }

    public static class Cotxe{
        String matricula;
        Cotxe(String m){this.matricula = m;}
    }
    public static class Bici{
        String matricula;
        Bici(String m){this.matricula = m;}
    }
}
