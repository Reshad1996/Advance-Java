package Class16;

public class HMW01_SumOfAllElements {

    // Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class.
    //________________________________________________________________________________________________________________

    int arraySum (int arr[]) {

        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public static void main(String[] args) {

        HMW01_SumOfAllElements obj = new HMW01_SumOfAllElements();
       int arr[] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("Sum of all elements is = "+obj.arraySum(arr)+ ".");
    }

}
