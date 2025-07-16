package tcp_demo7;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {

    private Socket socket;

    public ServerThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {

            // 流数据写入日志
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            int index = 0;
            File file = new File(System.getProperty("user.dir") + "/network_demo/src/tcp_demo7/server_log_" + index + ".txt");
            while (file.exists()){
                index++;
                file = new File(System.getProperty("user.dir") + "/network_demo/src/tcp_demo7/server_log_" + index + ".txt");
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

            // 反馈
            BufferedWriter socketBufferedWriter = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
            socketBufferedWriter.write("成功写入服务端日志文件");
            socketBufferedWriter.newLine();
            socketBufferedWriter.flush();

            this.socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
