package ProgOrientadaObjectes.Abstracte;

public abstract class ClaseAbstracte {

    String nom;
    ClaseAbstracte(String nom){this.nom = nom;}

    public static class SubClase1 extends ClaseAbstracte{
        int x;
        SubClase1(String n, int x){
            super(n);
            this.x = x;
        }
    }
}
