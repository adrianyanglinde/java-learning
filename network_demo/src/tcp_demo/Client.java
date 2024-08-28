package tcp_demo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.51.147", 10200);
        OutputStream os = socket.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());
        socket.close();
    }
}
