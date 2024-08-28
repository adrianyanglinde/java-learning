package tcp_demo3;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.51.147", 10204);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String str;
        while ((str = bufferedReader.readLine()) != null){
            if(str.equals("886")){
                break;
            }
            bufferedWriter.write(str);
            if(str.equals("new line")){
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }
        socket.close();
    }
}
