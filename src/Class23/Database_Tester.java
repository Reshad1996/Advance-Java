package Class23;

public class Database_Tester {

    public static void main(String[] args) {
        Abstraction_Database dataBase=new Oracle();
        dataBase.openDatabase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();
    }
}
