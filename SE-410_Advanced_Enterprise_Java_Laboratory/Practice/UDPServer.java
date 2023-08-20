package Practice;

// UDP Server
import java.net.*;
public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(9876);
        byte[] receiveData = new byte[1024];

        while (true) {
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);
            String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received from client: " + clientMessage);

            String reversedMessage = new StringBuilder(clientMessage).reverse().toString();
            InetAddress clientIP = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();
            byte[] sendData = reversedMessage.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientIP, clientPort);
            serverSocket.send(sendPacket);
        }
    }
}
