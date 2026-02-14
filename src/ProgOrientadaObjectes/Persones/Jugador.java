package ProgOrientadaObjectes.Persones;

public class Jugador extends Persona{

    enum POSICIO {DEVANTER, MIG, DEFENSA, PORTER};
    int numGols;
    String equip;
    POSICIO posicio;

    Jugador(String n, int e, SEXE s, int g, String eq, POSICIO p){
        super(n, e, s);
        this.numGols = g;
        this.equip = eq;
        this.posicio = p;
    }

    public int getNumGols() { return numGols; }
    public String getEquip() { return equip; }
    public POSICIO getPosicio() { return posicio; }

    public void setNumGols(int numGols) { this.numGols = numGols; }
    public void setEquip(String equip) { this.equip = equip; }
    public void setPosicio(POSICIO posicio) { this.posicio = posicio; }

    void print(){
        System.out.printf("%s juga a l'equip %s. És en la posició %s i du %d gols.\n", nom, equip, posicio,numGols);
    }
}
