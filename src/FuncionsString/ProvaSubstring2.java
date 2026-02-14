package FuncionsString;

public class ProvaSubstring2 {

    public static void main(String[] args) {

        String paragraf = "Hola que tal com va";

        int numparaules= 0;
        while(paragraf.indexOf(" ")!= -1) {
            int posBlank = paragraf.indexOf(' ');
            String paraula = paragraf.substring(0, posBlank);
            paragraf = paragraf.substring(posBlank + 1);
            numparaules++;
        }
        numparaules++;
        System.out.println(numparaules);
    }
}