package ProgOrientadaObjectes.Abstracte;

public class MainAbstracte {

    public static void main(String[] args) {
        ClaseAbstracte ca;
        ClaseAbstracte.SubClase1 sb1;

        //ca = new ClaseAbstracte("dhfsd"); //Error ABSTRACTE
        sb1 = new ClaseAbstracte.SubClase1("aa", 2);
    }
}
