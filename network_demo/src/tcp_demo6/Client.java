package tcp_demo6;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.51.147", 10204);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/yanglinde/Documents/project/java-learning/network_demo/src/tcp_demo6/test_client.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String str;
        while ((str = bufferedReader.readLine()) != null){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        socket.shutdownOutput();

        BufferedReader socketBufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(socketBufferedReader.readLine());

        bufferedReader.close();
        socket.close();
    }
}
