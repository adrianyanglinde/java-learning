package udp_demo;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Sender {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String next = scanner.next();
            if(next.equals("886")){
                break;
            }
            byte[] bytes = next.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.51.147"),10089);
            ds.send(dp);
        }
        ds.close();
    }
}
