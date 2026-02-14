package ProgOrientadaObjectes.Persones;

public class Main {

    public static void main(String[] args) {

        Alumne a1, a2;
        a1 = new Alumne("Pere", 15, Persona.SEXE.HOME, 1, 'A');
        a2 = new Alumne("Maria", 16, Persona.SEXE.DONA, 2, 'B');
        System.out.print("Alumnes:\n");
        a1.print();
        a2.print();

        Persona p1, p2;
        p1 = new Persona("Joan", 24, Persona.SEXE.HOME);
        p2 = new Persona("Raisa", 17, Persona.SEXE.DONA);
        System.out.println("\nPersones:");
        p1.print();
        p2.print();

        Professor P1, P2;
        P1 = new Professor("Manel", 58, Persona.SEXE.HOME, 38, "Física");
        P2 = new Professor("Tomeu", 55, Persona.SEXE.HOME, 16, "Matemàtiques");
        System.out.println("\nProfessors: ");
        P1.print();
        P2.print();

        Jugador j1;
        j1 = new Jugador("Iker",16, Persona.SEXE.HOME,20,"Campos", Jugador.POSICIO.DEVANTER);
        System.out.println("\nJugadors:");
        j1.print();
    }
}
