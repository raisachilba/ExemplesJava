package EstructuresDades;

import java.util.LinkedList;

public class MainLinkedList {

    public static void main(String[] args) {
        //Declaració de llistes de nodes
        //La variable serà un ArrayList de integer(int). Es posa entre <>, ja que es genèric. Podem posar del tipus que sigui
        LinkedList<Integer> llistaNums;
        LinkedList<Character> llistaLletres;

        //Declaració d'un array normal
        int[] array;

        //Creacióp / instanciació
        llistaNums = new LinkedList<>();
        llistaLletres = new LinkedList<>();
        array = new int[10];

        //Afegir elements
        llistaNums.add(22);
        llistaNums.add(23);
        llistaNums.add(7);

        //isEmpty
        boolean esBuit = llistaNums.isEmpty();

        //numElements
        int num = llistaNums.size();

        //removeElement
        llistaNums.remove(0);

        //Accedir a objecte d'una posició
        int primer = llistaNums.get(0);

        //Recórrer array
        for(int i=0; i<llistaNums.size(); i++){
            System.out.print(llistaNums.get(i));
        }

        //For each; per cada element del conjunt
        for(Integer i : llistaNums){
            System.out.print(i);
        }
    }
}
