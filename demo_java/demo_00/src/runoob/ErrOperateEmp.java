package runoob;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class ErrOperateEmp {
    public static void main(String[] args) {
        try {
            throw new Exception("fxck Exception");
        } catch (Exception e) {
            System.err.println("Caught err");
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("最后了...");
//            System.exit(0);
        }
    }
}
