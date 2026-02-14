package ProgOrientadaObjectes.Persones;

public class Professor extends Persona{

    int anysDocent;
    String departament;

    Professor(String n, int e, SEXE s, int a, String d){
        super(n, e, s);
        this.anysDocent = a;
        this.departament = d;
    }

    public int getAnysDocent() { return anysDocent; }
    public String getDepartament() { return departament; }

    public void setAnysDocent(int anysDocent) { this.anysDocent = anysDocent; }
    public void setDepartament(String departament) { this.departament = departament; }

    void print(){
        System.out.printf("%s és professor del departament %s, fa %d.", nom, departament, anysDocent);
    }
}
