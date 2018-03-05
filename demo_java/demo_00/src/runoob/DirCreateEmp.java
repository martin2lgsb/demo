package runoob;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class DirCreateEmp {
    public static void main(String[] args) {
        String dirs = "./a";
        File dirFile = new File(dirs);
        boolean res = dirFile.mkdir();
        System.out.println(res);
        System.out.println(dirFile.isDirectory());
        System.out.println(Arrays.toString(dirFile.list()));
        System.out.println(dirFile.isHidden());

        File dir = new File("../");
        String[] children = dir.list();
        if (children != null) {
            System.out.println(Arrays.toString(children));
        }

        File file = new File("runoob.txt");
        System.out.println(file.getParent());
        System.out.println(file.getPath());

        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        };

        File[] files = dir.listFiles(fileFilter);
        System.out.println(Arrays.toString(files));

        File[] roots = File.listRoots();
        System.out.println(Arrays.toString(roots));

        System.out.println(dirFile.delete());
    }
}
