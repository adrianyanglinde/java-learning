package tcp_demo2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.51.147", 10200);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,tcp,我来了".getBytes());

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println("我客户端接受到服务端发来的反馈：" + new String(bytes,0,len));
        socket.close();
    }
}
