package tcp_ip;

    import java.io.*;
    import java.net.*;

public class MyServer {
    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(1111);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();


            System.out.println("Message from client: "+str);
            ss.close();
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
