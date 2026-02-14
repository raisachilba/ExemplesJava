package FuncioRecursiva;

public class DivisionControlada {

    public static void main(String[] args) {

    }

    public int controlledDivide(int a, int b){
        if(b>a){
            return a*2;
        }
        else if(b==0){
            return a;
        }
        else{
            return controlledDivide(a/2, b-1)+controlledDivide(a/2, b-1);
        }
    }

    public int controlledPriorityDivide(int x, int y, int p){
        if (p>x+y){
            return p;
        }
        else if(x<0 || y<0){
            return -1;
        }
        else if(y!=0 && x % y == 0){
            return controlledDivide(x,y);
        }
        else{
            return controlledPriorityDivide(x-1, y-1, p-1);
        }
    }
}
