package Arrays;

public class DeArrayAString {

    public static void main(String[] args) {

        int[]x={5, 10, 15};
        System.out.println(array2String(x));
        sumaUn(x);
        System.out.println(array2String(x));
    }
    public static String array2String(int[]n){
        String txt = "";
        for(int i = 0; i < n.length; i++){
            txt += n[i] + ", ";
        }
        return txt;
    }
    public static void sumaUn(int[]n){
        for(int i = 0; i < n.length; i++){
            n[i]++;
        }
        System.out.println(array2String(n));
    }
}