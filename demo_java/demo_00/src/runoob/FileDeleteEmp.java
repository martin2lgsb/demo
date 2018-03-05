package runoob;

import java.io.File;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class FileDeleteEmp {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            if (file.delete()) {
                System.out.println(file.getName() + "删除成功");
            } else {
                System.out.println("删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
