package Class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDem01 {
    public static void main(String[] args) throws IOException {

        /*
           rightclick on your copypathreference then click from content root
        */
        var path = "Data/config.properties"; // The location of the file
        var fileInputStream = new FileInputStream(path);  // Navigate to the file
        var propertise = new Properties(); // that special software which hepls us read data from that file
        propertise.load(fileInputStream);  // it loads all the data from the file inside (Memory)
        System.out.println(propertise.getProperty("URL"));
        System.out.println(propertise.getProperty("password"));
        fileInputStream.close();  // closes the file

    }
}
