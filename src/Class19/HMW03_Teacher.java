package Class19;

public class HMW03_Teacher {

    // Write a Java program called Teacher.  Identify features and behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own
    // features and behaviour. Test all 4 classes
    //_____________________________________________________________________________________________________

    String teacherName;
    String teacherId;
    String teacherFiled;
    String teacherDep;


    public HMW03_Teacher(String teacherName, String teacherId, String teacherFiled,String teacherDep) {
        this.teacherName = teacherName;
        this.teacherId = teacherId;
        this.teacherFiled = teacherFiled;
        this.teacherDep = teacherDep;

    }

    public void teacher1() {
        System.out.println("Teacher Name is "+teacherName+" his ID : "+teacherId+" " +
                "and he is teaching "+teacherFiled+" and she is "+teacherDep+" of Department");
    }
}

class MathTeacher extends HMW03_Teacher {

    String subject1;
    public MathTeacher(String teacherName, String teacherId, String teacherFiled,String teacherDep,String subject1) {
        super(teacherName, teacherId, teacherFiled, teacherDep);
        this.subject1 = subject1;
    }
    public void teacher2() {
        System.out.println("Teacher Name is "+teacherName+" his ID  : "+teacherId
                +" and he is teaching "+teacherFiled+","+subject1+" and she is from "+teacherDep+" Department");
    }
}

class ChemistryTeacher extends HMW03_Teacher {
    String subject2;
    public ChemistryTeacher(String teacherName, String teacherId, String teacherFiled,String teacherDep,String subject2) {
        super(teacherName, teacherId, teacherFiled, teacherDep);
        this.subject2 = subject2;
    }
    public void teacher3() {
        System.out.println("Teacher Name is "+teacherName+" his ID : "+teacherId
                +" and he is teaching "+teacherFiled+","+subject2+" and she is from "+teacherDep+" Department");
    }
}

class PianoTeacher extends HMW03_Teacher {
    String medal;
    public PianoTeacher(String teacherName, String teacherId, String teacherFiled,String teacherDep,String medal) {
        super(teacherName, teacherId, teacherFiled, teacherDep );
        this.medal=medal;
    }
    public void teacher4() {
        System.out.println("Teacher Name is "+teacherName+" his ID : "+teacherId
                +" and he is teaching "+teacherFiled+", and she is from " +
                ""+teacherDep+" Department and she owes a "+medal);
    }

    public static void main(String[] args) {
        new HMW03_Teacher("Reshad", "123", "History", "Head").teacher1();
        new MathTeacher("Srosh","456","Math","Mathematic","Statistic").teacher2();
        new ChemistryTeacher("Shahir", "789", "Math ", "Science", "Statistic").teacher3();
        new PianoTeacher("Rashid","222","Piano","Music","Gold").teacher4();
    }
}