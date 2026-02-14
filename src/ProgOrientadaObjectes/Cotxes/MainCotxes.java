package ProgOrientadaObjectes.Cotxes;

public class MainCotxes {

    public static void main(String[] args) {

        //Declaració
        Cotxe c1, c2, c3;

        //Cridades constructors
        c1 = new Cotxe("Mercedes", "6332MLB", 2);
        c2 = new Cotxe("Fiat", "IB2367CL");
        c3 = new Cotxe("Audi", "4789MBL", 85, 4);

        //Setters
        c1.setVelocitat(40);
        c2.setMarca("Seat");
        c3.setMatricula("1293MBL");

        //Getters
        System.out.printf("El cotxe de matrícula %s, circula a %f km/h.\n", c1.getMatricula(), c1.getVelocitat());

        //Altres
        c1.acceleracio(30);
        c2.acceleracio(20);

        c1.print();
        c2.print();
        c3.print();
    }
}
