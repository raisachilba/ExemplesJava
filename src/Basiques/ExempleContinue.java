package Basiques;

public class ExempleContinue {

    public static void main(String[] args){

        for(float i = -10; i<=10; i++){
            if(i==0){
                continue;
            }
            System.out.println(1/i);
        }
    }
}
