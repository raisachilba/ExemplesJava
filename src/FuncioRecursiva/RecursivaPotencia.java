package FuncioRecursiva;

public class RecursivaPotencia {

    public static void main(String[] args) {
        System.out.println(potencia(2,4));
        System.out.println(potencia2(2,4));
    }
    public static int potencia(int b, int e){
        if(e==0){
            return 1;
        }else{
            return b*potencia(b, e-1);
        }
    }
    public static int potencia2(int b, int e){
        if(e==0){
            return 1;
        }else if(e%2==0){
            return potencia2(b,e/2) * potencia2(b,e/2);
        }else{
            return b * potencia2(b,e/2) * potencia2(b,e/2);
        }
    }
}