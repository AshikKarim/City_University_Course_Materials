package Practice;

// UDP Client
import java.net.*;
public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress serverIP = InetAddress.getByName("localhost");
        int serverPort = 9876;

        String message = "Hello UDP Server!";
        byte[] sendData = message.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverIP, serverPort);
        clientSocket.send(sendPacket);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);

        String reversedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Received from server: " + reversedMessage);

        clientSocket.close();
    }
}
