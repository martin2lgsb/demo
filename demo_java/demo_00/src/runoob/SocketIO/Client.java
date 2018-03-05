package runoob.SocketIO;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 1234);
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            bw.write("测试客户端和服务器通信，服务器接受到的. from client.\n");
            bw.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String mess = br.readLine();
            System.out.println("服务器：" + mess);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
