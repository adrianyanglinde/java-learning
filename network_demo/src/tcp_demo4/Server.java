package tcp_demo4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10204);
        Socket accept = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        // 包装成 字符缓冲输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "/network_demo/src/tcp_demo4/test.txt"));
        String str;
        while ((str = bufferedReader.readLine())!=null){
            if(str.equals("886")){
                break;
            }
            System.out.println("server received: "+str);
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        serverSocket.close();
    }
}
