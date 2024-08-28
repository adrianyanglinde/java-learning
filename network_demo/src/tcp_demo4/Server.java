package tcp_demo4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10204);
        Socket accept = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/yanglinde/Documents/project/java-learning/network_demo/src/tcp_demo4/test.txt"));
        String str;
        while ((str = bufferedReader.readLine())!=null){
            if(str.equals("886")){
                break;
            }
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        serverSocket.close();
    }
}
