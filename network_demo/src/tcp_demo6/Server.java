package tcp_demo6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10205);
        Socket accept = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/network_demo/src/tcp_demo6/test.txt"));
        String str;
        while ((str = bufferedReader.readLine())!=null){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        BufferedWriter socketBufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        socketBufferedWriter.write("成功写入服务端日志文件");
        socketBufferedWriter.newLine();
        socketBufferedWriter.flush();

        bufferedWriter.close();
        serverSocket.close();

    }
}
