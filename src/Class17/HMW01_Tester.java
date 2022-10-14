package Class17;

public class HMW01_Tester {

    public static void main(String[] args) {
        HMW01_Phone_Constructor a = new HMW01_Phone_Constructor();
        HMW01_Phone_Constructor b = new HMW01_Phone_Constructor("iphone", "14" +
                " pro Max",2022);
        a.printPhone();
        b.printPhone();
    }
}
