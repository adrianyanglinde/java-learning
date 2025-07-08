package tcp_demo3;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10204);
        // 包装 System.in（标准输入流）为 字符缓冲输入流，用于从控制台读取用户输入，方便调用readLine()
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // 包装 socket.getOutputStream() 字节输出流 为 字符缓冲输出流，用于向服务器发送数据
        // （它的核心作用是减少直接 I/O 操作次数，通过缓冲区（内存）批量写入数据，显著提升性能）
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String str;
        while ((str = bufferedReader.readLine()) != null){  // .readLine() 等待用户输入（阻塞）
            if(str.equals("886")){
                break;
            }
            bufferedWriter.write(str);
            bufferedWriter.newLine();       // newLine() 添加换行符（模拟 println）
            bufferedWriter.flush();         // 强制刷新缓冲区，确保数据立即发送
        }
        socket.close();
    }
}
