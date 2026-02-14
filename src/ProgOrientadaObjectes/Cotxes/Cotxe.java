package ProgOrientadaObjectes.Cotxes;

public class Cotxe {

    //Atributs
    String marca;
    String matricula;
    float velocitat;
    int numPortes;

    //Mètodes

    //Constructor(s)
    Cotxe(String mc, String mt, float v, int numP){
        marca = mc;
        matricula = mt;
        velocitat = v;
        numPortes = numP;
    }
    Cotxe(String mc, String mt, int numP){
        marca = mc;
        matricula = mt;
        velocitat = 0;
        numPortes = numP;
    }
    Cotxe(String mc, String mt){
        marca = mc;
        matricula = mt;
        velocitat = 0;
        numPortes = 4;
    }

    //Setters (mutadors)
    void setMarca(String mc){
        marca = mc;
    }
    void setMatricula(String mt){
        matricula = mt;
    }
    void setVelocitat(float v){
        velocitat = v;
    }
    void setNumPortes(int numP){
        numPortes = numP;
    }

    //Getters (accesores)
    String getMarca(){
        return marca;
    }
    String getMatricula(){
        return matricula;
    }
    float getVelocitat(){
        return velocitat;
    }
    int getNumPortes(){
        return numPortes;
    }

    //Altres
    void print(){
        System.out.printf("%s (%d), %s - %f.\n", marca, numPortes, matricula, velocitat);
    }
    void acceleracio(float q){
        velocitat += q;
    }
}
