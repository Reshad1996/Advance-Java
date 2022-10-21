package Class23;

public class HMW01_File {

    /* Create a class File that will have the following behaviors: open, edit, close.
       Edit and close are implemented method while open is an abstract.
       Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of
       open behaviour: Example: to open .java file we need notepad++ or sublime text,
       to open .doc file we need Microsoft word to be installed etc
     */

}

abstract class  File {

    abstract void open();
    public  void edit() {
        System.out.println("It edit the file");
    }
    public  void close() {
        System.out.println("It close the file");
    }
}

class JavaFile extends File{

    void open() {
        System.out.println("to open .java file we need notepad++ or sublime text");
    }
}

class WordFile extends File{

    void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");
    }
}

class PdfFile extends File {

    void open() {
        System.out.println("to open .PDF file we need Adobe Reader to be installed");
    }

    public static void main(String[] args) {

        File[] file = {new JavaFile(),new PdfFile(),new WordFile()};
        for (File f:file) {
            f.open();
        }
    }
}