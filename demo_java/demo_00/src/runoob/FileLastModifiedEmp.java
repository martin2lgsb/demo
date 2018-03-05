package runoob;

import java.io.File;
import java.util.Date;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class FileLastModifiedEmp {
    public static void main(String[] args) throws Exception {
        File fileToChange = new File("runoobmodify.txt");
        fileToChange.createNewFile();
        Date filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
        System.out.println(fileToChange.setLastModified(System.currentTimeMillis()));
        filetime = new Date(fileToChange.lastModified());
        System.out.println(filetime.toString());
    }
}
