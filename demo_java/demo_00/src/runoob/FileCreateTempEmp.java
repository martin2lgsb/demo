package runoob;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class FileCreateTempEmp {
    public static void main(String[] args) throws Exception {
        File temp = File.createTempFile("testrunoobtmp", ".txt");
        System.out.println(temp.getAbsolutePath());
        temp.deleteOnExit();

        BufferedWriter out = new BufferedWriter(new FileWriter(temp));
        out.write("aString");
        out.close();
    }
}
