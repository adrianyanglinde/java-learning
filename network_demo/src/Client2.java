import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client2 {
    public static void main(String[] args) throws IOException {
        receiveUdp();
    }
    /**
     * 07_UDP接收数据
     */
    public static void receiveUdp() throws IOException {
        DatagramSocket ds = new DatagramSocket(10087);
        while (true){
            byte[] byts = new byte[1024];
            DatagramPacket dp = new DatagramPacket(byts, byts.length);
            ds.receive(dp);
            System.out.println("数据是：" + new String(dp.getData(),0,dp.getLength()));
        }
    }
}
