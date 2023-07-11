
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Rmi_interface extends Remote {
public double getSquare(double input) throws RemoteException;
public double getSquareRoot(double input) throws RemoteException;
}
