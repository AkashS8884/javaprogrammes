import java.nio.channels.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class RMI_SquaredServer extends UnicastRemoteObject implements Rmi_interface {
public RMI_SquaredServer() throws RemoteException {
super();
}
public double getSquare(double input) throws RemoteException {
return input * input;
}
public double getSquareRoot(double input) throws RemoteException {
return Math.sqrt(input);
}
public static void main(String[] args) throws RemoteException, AlreadyBoundException,
java.rmi.AlreadyBoundException {
try {
Registry registry = LocateRegistry.createRegistry(7777);
registry.bind("squared",new RMI_SquaredServer());
System.out.println("The Rmi is runnimg already ");
}catch(Exception e) {
    System.out.println("Error!!");
    }
    }
    }