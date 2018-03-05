package runoob;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class FileReaderEmp {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("runoob.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
//            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
