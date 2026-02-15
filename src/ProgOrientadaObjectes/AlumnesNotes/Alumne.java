package ProgOrientadaObjectes.AlumnesNotes;

public class Alumne {

    private String id;
    private Nota[] historialNotes;
    private int numNotes = 0;

    public Alumne(String id){
        this.id = id;
        this.historialNotes = new Nota[100];
    }

    public Alumne(String id, Nota[] notes, int r){
        this.id = id;
        this.historialNotes = notes;
        this.numNotes = r;
    }

    public int getNumNotes(){  return numNotes;  }

    public String getId() {  return id; }

    public Nota getHistorialNotes(int n){
        return this.historialNotes[n];
    }

    public void setHistorialNotes(Nota n){
        historialNotes[numNotes] = n;
        numNotes = numNotes + 1;
    }

    public double calcMitjanaPonderadaNotes(){
        double sum = 0;
        int numNotes = 0;
        for(int i = 0; i<historialNotes.length-1; i++){
            if(historialNotes[i]!=null){
                sum = sum + historialNotes[i].getValor();
                numNotes++;
            }
        }
        return sum/numNotes;
    }

    public String millorNota() {
        double max = 0;
        String millorNota = null;
        for(int i = 0; i< historialNotes.length; i++){
            if(historialNotes[i].getValor()>max){
                millorNota = historialNotes[i].getAssignatura();
            }
        }
        return millorNota;
    }

}
