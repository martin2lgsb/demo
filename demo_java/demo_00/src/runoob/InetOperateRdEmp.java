package runoob;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class InetOperateRdEmp {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.runoob.com");
        URLConnection conn = url.openConnection();
        HttpURLConnection httpCon = (HttpURLConnection) conn;
        long date = httpCon.getDate();
        System.out.println(new Date(date));

        Map headers = conn.getHeaderFields();
        Set<String> keys = headers.keySet();
        for (String key: keys) {
            System.out.println(conn.getHeaderField(key));
        }
        System.out.println(conn.getLastModified());

        System.out.println(url.getProtocol());
    }
}
