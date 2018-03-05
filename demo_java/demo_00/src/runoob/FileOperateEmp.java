package runoob;

import java.io.File;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class FileOperateEmp {
    public static void main(String[] args) {
        long size = getFileSize("runoob.txt");
        System.out.println(size);

        File oldName = new File("runoobmodify.txt");
        File newName = new File("runoobmodified.txt");
        if (oldName.renameTo(newName)) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }

        System.out.println(newName.setReadOnly());
        System.out.println(newName.canWrite());
    }

    public static long getFileSize(String filename) {
        File file = new File(filename);
        if (!file.exists() || !file.isFile()) {
            System.out.println("文件不存在");
            return -1;
        }
        return file.length();
    }
}
