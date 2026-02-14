package ProgOrientadaObjectes.estatic;

public class MainEstatiques {

    //quan una variable es static, es una propietat de la clase no de l'objecte.
    public static void main(String[] args) {
        CosesEstatiques c1, c2;

        c1 = new CosesEstatiques(10, 20);
        c2 = new CosesEstatiques(15, 25);

        System.out.println("X de C1: "+ c1.x);
        System.out.println("X de C2: "+ c2.x);
        System.out.println("Y: "+ CosesEstatiques.y);

        c1.hola();
        CosesEstatiques.sHola();
    }
}
