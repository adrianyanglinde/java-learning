package tcp_demo5;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10204);

        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(System.getProperty("user.dir") + "/network_demo/src/tcp_demo5/test_client.txt")));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/network_demo/src/tcp_demo5/test_client.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String str;
        while ((str = bufferedReader.readLine()) != null){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        socket.close();
    }
}
