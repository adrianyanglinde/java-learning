package tcp_demo3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10204);
        Socket accept = serverSocket.accept();     // .accept() 等待用户连接（阻塞）
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String str;
        while ((str = bufferedReader.readLine())!=null){    // .readLine() 等待用户输入（阻塞）
            System.out.println("接受到来自客户端发来的数据是：" + str);
            if(str.equals("886")){
                System.out.println("客户端终止请求");
                break;
            }
        }
        serverSocket.close();
    }
}
