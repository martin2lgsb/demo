package runoob;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class InetWebPingEmp {
    public static void main(String[] args) {
        try {
            InetAddress addr;
            Socket sock = new Socket("www.runoob.com", 80);
            addr = sock.getInetAddress();
            System.out.println(addr + "：连接成功");
            sock.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
