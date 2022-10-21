package Class23;

public interface Interface_IDatabase {
    void openDatabase();
    void readData();
    void writeData();
}

class IBM implements Interface_IDatabase{


    @Override
    public void openDatabase() {
        System.out.println("Opening the IBM database");
    }

    @Override
    public void readData() {
        System.out.println("Reading the data from the IBM Database");
    }

    @Override
    public void writeData() {
        System.out.println("Writing the data to the database");
    }

    public static void main(String[] args) {
        Interface_IDatabase iDataBase=new IBM();
        iDataBase.openDatabase();
        iDataBase.readData();
        iDataBase.writeData();

        //1:40

    }
}