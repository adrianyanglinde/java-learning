package udp_demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Reciever {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10089);
        byte[] bytes = new byte[1024];
        while (true){
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
            ds.receive(dp);
            System.out.println("接收到的数据是：" + new String(dp.getData(),0, dp.getLength()));
        }


    }
}
