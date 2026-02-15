package ProgOrientadaObjectes.AlumnesNotes;

public class Nota {

    private String assignatura;
    private float valor;
    private float pes;

    public Nota(String a, float v, float p){
        this.assignatura = a;
        this.valor = v;
        this.pes = p;
    }

    public String getAssignatura( ) { return assignatura; }
    public float getValor( ) { return valor; }
    public float getPes () { return pes; }
}
