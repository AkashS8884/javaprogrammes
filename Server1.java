import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class Server1 {
    public  static void main(String [] args){
        try{
            ServerSocket ss=new ServerSocket(5000);
            Socket s1=ss.accept();
            DataOutputStream dout=new DataOutputStream(s1.getOutputStream());
                        DataInputStream din=new DataInputStream(s1.getInputStream());
            dout.writeUTF("HELLO CLIENT");
            String msg=din.readUTF();
            System.out.println("msg from client"+msg);
        }catch(Exception e){
            System.out.println(e);

        }

  
        }

    }
    

