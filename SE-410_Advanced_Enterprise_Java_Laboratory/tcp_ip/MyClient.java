package tcp_ip;


 import java.io.*;
 import java.net.*;

public class MyClient {
    public static void main(String[] args) {

        try{
            Socket s = new Socket("localhost", 1111);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");

        }
        catch (Exception ex) {
            System.out.println(ex);
        }
        }
    }
