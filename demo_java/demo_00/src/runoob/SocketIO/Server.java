package runoob.SocketIO;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("启动服务器...");
            Socket s = ss.accept();
            System.out.println(s.getInetAddress().getLocalHost() + "已连接到服务器。");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String mess = br.readLine();
            System.out.println(mess);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write(mess + " from server.\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
