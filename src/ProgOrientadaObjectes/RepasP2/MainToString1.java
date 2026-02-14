package ProgOrientadaObjectes.RepasP2;

public class MainToString1 {

    public static void main(String[] args) {
        Persona p1, p2;

        p1 = new Persona("Paco", 33);
        p2 = new Persona("Paco", 33);

        String txtP1 = p1.toString();
        System.out.println(p1); //Si hi ha el mètode toString, imprimirà el que retorna toString
        //Si no existeix el mètode toString, intentarà imprimir l'objecte, imprimirà la seva adreça de memòria
        /*
        if(p1 == p2){
            System.out.println("Iguals P1 i P2");
        }else{
            System.out.println("Diferents P1 i P2");
        }
        Això no es pot fer, ja que el que compara es si els dos objectes es troben a la mateixa memòria,
        per tant sempre sortirà diferent. Per això, hem d'emplear el mètode equals.
         */
        if(p1.equals(p2)){
            System.out.println("Iguals P1 i P2");
        }else{
            System.out.println("Diferents P1 i P2");
        }
    }
    //Es una classe, es com si estigues creada a un altre fitxer
    //Ha de ser static si ho vull emplear dins aquest entorn.
    public static class Persona{
        String nom;
        int edat;

        public Persona(String nom, int edat){
            this.nom = nom; this.edat = edat;
        }

        @Override
        public String toString() {
            return nom.toUpperCase()+" : "+edat;
        }

        public boolean equals(Object o){
            Persona po = ((Persona)o);
            //Nom es un string, que es un objecte que la seva classe ja ha heretat el mètode equals
            if(this.nom.equals(po.nom) && this.edat == po.edat){
                return true;
            }else{
                return false;
            }
        }
    }
}
