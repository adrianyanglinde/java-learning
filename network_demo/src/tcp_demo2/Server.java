package tcp_demo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10200);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println("接受到来自客户端发来的数据是：" + new String(bytes,0,len));


        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("数据收到了".getBytes());
        serverSocket.close();
    }
}
