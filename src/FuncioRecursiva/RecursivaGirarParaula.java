package FuncioRecursiva;

public class RecursivaGirarParaula {

    public static void main(String[] args) {

        String s = "murciélago";
        System.out.printf("%s girat és %s", s, gira(s));
    }
    public static String gira(String s){
        if(s.length()==1){
            return s;
        }else{
            char c = s.charAt(0);
            String s2 = s.substring(1);
            return gira(s2) + c;
        }
    }
}