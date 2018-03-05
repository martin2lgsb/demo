package runoob;

import java.io.IOException;
import java.net.*;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class InetOperateEmp {
    public static void main(String[] args) {
        InetAddress address1 = null;
        try {
            address1 = InetAddress.getByName("www.runoob.com");
        } catch (UnknownHostException e) {
            System.exit(2);
        }

        System.out.println(address1.getHostName());
        System.out.println(address1.getHostAddress());
//        System.exit(0);

        Socket skt1;
        String host1 = "localhost";
        if (args.length > 0) {
            host1 = args[0];
        }

        for (int i=0; i<50; i++) {
            try {
                skt1 = new Socket(host1, i);
                System.out.println(i + ": 已被使用");
            } catch (UnknownHostException e) {
                System.out.println(e);
                break;
            } catch (IOException e) {
//                e.printStackTrace();
            }
        }
    }
}
