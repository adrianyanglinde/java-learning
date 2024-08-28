package tcp_demo7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10205);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new ServerThread(socket)).start();
        }
//        serverSocket.close();
    }
}
