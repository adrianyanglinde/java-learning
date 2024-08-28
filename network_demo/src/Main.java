import java.io.IOException;
import java.net.*;

public class Main {
    public static void main(String[] args) throws IOException {

        sendUdp();
    }

    /**
     * 04_InetAddress
     */
    public static void ipAddress() throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.51.147");
        String hostName = address.getHostName();
        String hostAddress = address.getHostAddress();
        System.out.println("主机名：" + hostName);
        System.out.println("ip地址：" + hostAddress);
    }

    /**
     * 06_UDP发送数据
     */
    public static void sendUdp() throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] byts = "洪丹萍".getBytes();
        DatagramPacket dp = new DatagramPacket(byts, byts.length, InetAddress.getByName("192.168.51.147"), 10087);
        ds.send(dp);
        ds.close();
    }


}