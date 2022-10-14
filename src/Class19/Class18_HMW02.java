package Class19;

public class Class18_HMW02 {

    /*
     Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
     Instance variables are being initialized
     Both Constructors are being executed
  */

    String name;
    String author;
    int noOfTotalCh;
    int ISBN;

    public Class18_HMW02(String name,String author,int noOfTotalCh,int ISBN){
       /* this.name=name;
        this.author=author;
        this.noOfTotalCh=noOfTotalCh;*/
        this(name, author, noOfTotalCh);
        this.ISBN=ISBN;
    }

    public Class18_HMW02(String name,String author,int noOfTotalCh){
        this.name=name;
        this.author=author;
        this.noOfTotalCh=noOfTotalCh;
    }
    public static void main(String[] args) {
        Class18_HMW02 headFirstJava=new Class18_HMW02("HeadIFirstJava","Kathy",12,13345);
        Class18_HMW02 dataStructures =new Class18_HMW02("HeadIFirstJava","Kathy",12);
    }
}
