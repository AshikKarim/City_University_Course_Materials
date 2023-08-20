package Practice;

// TCP Client
import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        String serverIP = "127.0.0.1"; // Server IP address
        int serverPort = 12345;

        Socket socket = new Socket(serverIP, serverPort);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String serverResponse = in.readLine();
        System.out.println("Server Date & Time: " + serverResponse);

        in.close();
        socket.close();
    }
}