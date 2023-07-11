import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.xml.crypto.Data;

public class Client1 {
    public static void main(String [] args){
        try{
            Socket s=new Socket("localhost",5000);
        DataInputStream din =new DataInputStream(s.getInputStream());
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());
String msg=din.readUTF();
System.out.println("msg from server"+msg);
dout.writeUTF("helloserver");
       }catch(Exception e){
        System.out.println(e);
       }
       }
    }

