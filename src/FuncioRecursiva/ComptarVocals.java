package FuncioRecursiva;

public class ComptarVocals {

    public static void main(String[] args) {

        char x = 'Z';
        System.out.printf("%c és una vocal? %b", x, esUnaVocal(x));
        String s = "Aloha";
        System.out.printf("\n%s té %d vocals.", s, numVocals(s));
        String r = "aloha";
        System.out.printf("\n%s, resolt recursivament, té %d As.", r, numvoclasR(s));

    }
    //Funcions iteratives
    public static boolean esUnaVocal(char c){
        if (c=='a' || c== 'e' || c=='i' || c=='o' || c=='u'){
            return true;
        }else{
            return false;
        }
    }
    public static int numVocals(String s){
        int num = 0;
        for(int i=0; i<s.length();i++){
            char lletra = s.charAt(i);
            if(esUnaVocal(lletra)){
                num++;
            }
        }
        return num;
    }
    //Funcions recursives
    public static int numvoclasR(String s){
        if (s.length()== 1 && esUnaVocal(s.charAt(0))){
            return 1;
        }else if(s.length()== 1 && !esUnaVocal(s.charAt(0))){
            return 0;
        }else{
            String tros1 = s.substring(0,1);
            String tros2 = s.substring(1);
            return numvoclasR(tros1) + numvoclasR(tros2);
        }
    }
}