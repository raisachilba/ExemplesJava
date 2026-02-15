package ProgOrientadaObjectes.AlumnesNotes;

public class Principal {

    static Alumne[] alumnes = new Alumne[100];
    public static void main(String[] args) {
        //Alumne[] alumnes = new Alumne[100];

        alumnes[0] = new Alumne("Maria");
        alumnes[1] = new Alumne("Jaume");
        alumnes[2] = new Alumne("Pep");

        alumnes[0].setHistorialNotes(new Nota("Anglès", 8.0f, 0.5f));
        alumnes[0].setHistorialNotes(new Nota("Mates", 10.0f, 0.5f));
        alumnes[1].setHistorialNotes(new Nota("Català", 9.0f, 0.75f));

        System.out.println(alumnes[2].getId());
        System.out.println(alumnes[0].getNumNotes());
        System.out.println(alumnes[1].getHistorialNotes(0).getValor());
        System.out.println(alumnes[0].calcMitjanaPonderadaNotes());
    }

    public void agregarNota(Nota n, String id){
        for(int i = 0; i < alumnes.length-1; i++){
            if(id.equals(alumnes[i].getId())){
                alumnes[i].setHistorialNotes(n);
            }
        }
    }

    public String alumneAssignatura(String assignatura){
        return null;
    }

    public int quantesNotes(String assignatura){
        return 0;
    }
}
