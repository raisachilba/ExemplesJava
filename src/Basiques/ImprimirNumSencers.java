package Basiques;

public class ImprimirNumSencers {

    public static void main(String[] args){
        int a = 101;
        int b = 0100;
        int c = 0xFace;
        int d = 0b1111;
        long e = 100000L;

        System.out.println(a +","+ b +","+ c +","+ d +","+ e);

        double numA = 1e2;
        double numB = 2.;
        double numC = .54;
        double numD = 56.34E-45;
        float numE = 23.59F;
    }
}
