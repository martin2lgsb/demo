package runoob;

import java.net.URL;
import java.net.URLConnection;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class InetOperateNdEmp {
    public static void main(String[] args) throws Exception {
        int size1;
        URL url1 = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
        URLConnection conn = url1.openConnection();
        conn.setUseCaches(false);
        size1 = conn.getContentLength();
        long timestamp = conn.getLastModified();
        System.out.println(size1);
        System.out.println(timestamp);

        conn.getInputStream().close();
    }
}
