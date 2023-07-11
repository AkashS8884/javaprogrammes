import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
public class RMI_SquaredClient {
private static Scanner scan = null;
public static void main(String[] args) throws MalformedURLException,RemoteException,NotBoundException{
try {
Rmi_interface squaredapi = (Rmi_interface) Naming.lookup("rmi://localhost:7777/squared");
scan = new Scanner(System.in);
for(;;) {
System.out.println("***********");
System.out.println("The RMI is sqaured and sqaured Root");
System.out.println();
System.out.println("What to do today??");
System.out.println("1.Get the square of the number");
System.out.println("2.Get the square root of the number");
int choice = getChoice();
if(choice == 1) {
System.out.println(squaredapi.getSquare(getInput()));
}
else {
System.out.println(squaredapi.getSquareRoot(getInput()));
}
}
}catch(Exception e) {
System.out.println("Error!!!");
e.printStackTrace();
}
}
public static int getChoice() {
try {
System.out.println("Enter your choice");
int input = scan.nextInt();
if(input <1 || input >2) throw new Exception();
return input;
}
catch(Exception e) {
System.out.println("Error!!!!");
return getChoice();
}
}
public static double getInput() {
    try {
        System.out.println("Enter a number");
        double input = scan.nextDouble();
        return input;
        }catch(Exception e) {
        System.out.println("Error!");
        return getInput();
        }
        }
        }

