package FuncioRecursiva;

public class SumadorAlternado {

    public static void main(String[] args) {

    }

    public int alternativeSum(int a, int b){
        if(a==0){
            return b;
        }else if(b==0){
            return a;
        }else{
            return a - b + alternativeSum(a-1, b-1);
        }
    }

    
}
