package Class15;

public class HondaBike {
   static int topSpeed = 200;
   static int noOfTyres = 2;
   String model;
   int year;

    void printTotalDistance(int noOfGallons,int avg) {
       double distance = noOfGallons/10;
       System.out.println("your bike can go max "+distance+" with this much "+noOfGallons);
   }

    public static void main(String[] args) {
        System.out.println(HondaBike.noOfTyres);
        HondaBike cbr = new HondaBike();
        cbr.model = "cbr100";
        cbr.year = 2020;
        cbr.printTotalDistance(10,2);
    }
}
