package Review.Class14;

public class ExceptionDemo01 {
    public static void main(String[] args) throws AgeNotAllowed {
        int age=15;

        if(age<18){
            throw new AgeNotAllowed("You should not be here");
        }
    }
}
