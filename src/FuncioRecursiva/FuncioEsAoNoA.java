package FuncioRecursiva;

public class FuncioEsAoNoA {

    public static void main(String[] args) {

        char x = 'Z';
        System.out.printf("%c és una A? %b", x, esUnaA(x));
        String s = "Aloha";
        System.out.printf("\n%s té %d As.", s, numAs(s));
        String r = "aloha";
        System.out.printf("\n%s, resolt recursivament, té %d As.", r, numAsR(s));

    }
    //Funcions iteratives
    public static boolean esUnaA(char c){
        if (c=='a'|| c=='A'){
            return true;
        }else{
            return false;
        }
    }
    public static int numAs(String s){
        int num = 0;
        for(int i=0; i<s.length();i++){
            char lletra = s.charAt(i);
            if(esUnaA(lletra)){
                num++;
            }
        }
        return num;
    }
    //Funcions recursives
    public static int numAsR(String s){
        if (s.length()== 1 && esUnaA(s.charAt(0))){
            return 1;
        }else if(s.length()== 1 && !esUnaA(s.charAt(0))){
            return 0;
        }else{
            String tros1 = s.substring(0,1);
            String tros2 = s.substring(1);
            return numAsR(tros1) + numAsR(tros2);
        }
    }
}