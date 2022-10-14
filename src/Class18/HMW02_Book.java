package Class18;

public class HMW02_Book {

    // Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed
    //______________________________________________________________________________________________________________

    String bookName;
    String bookAuthor;
    double bookPrice;

    public HMW02_Book(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }


    public HMW02_Book(double bookPrice) {
        this.bookPrice = bookPrice;
        System.out.println("And the price of the book is "+bookPrice);
    }

    public void printInfo() {
        System.out.println("Name of the book is "+bookName+" and the author is "
                +bookAuthor);
    }

    public static void main(String[] args) {
         new HMW02_Book("Rich Dad Poor Dad","Robert T. Kiyosaki").printInfo();
         HMW02_Book obj = new HMW02_Book(12.99);

    }
}
