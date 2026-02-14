package Basiques;

public class ControlVelocitat3 {

    public static void main(String[] args){
        int velocitat = 150;
        if (velocitat <= 40) {
            System.out.println("Velocitat massa baixa.");
        }else if(velocitat <= 90) {
            System.out.println("Velocitat adequada.");
        }else{
            System.out.println("Velocitat excessiva.");
        }
    }
}