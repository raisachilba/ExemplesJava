package ProgOrientadaObjectes.Alumnes;

public class Alumne {

    //Propietats atributs
    String nom;
    int curs;
    char grup;

    //Mètodes

    //Constructor(s)
    Alumne(String n, int c, char g){
        nom  = n;
        curs = c;
        grup = g;
    }

    Alumne(String n){
        nom = n;
        curs = 1;
        grup = 'A';
    }

    //Setters (mutadores)
    void setNom(String n){
        nom = n;
    }
    void setCurs(int c){
        curs = c;
    }
    void setGrup(char g){
        grup = g;
    }
    void setCursGrup(int c, char g){
        curs = c;
        grup = g;
    }

    //Getters (accesores)
    String getNom(){
        return nom;
    }
    int getCurs(){
        return curs;
    }
    char getGrup(){
        return grup;
    }

    //Altres
    void print(){
        System.out.printf("%s - %d%c. \n", nom, curs, grup);
    }
}
