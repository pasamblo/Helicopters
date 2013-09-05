import java.io.*;
import java.net.*;

public class City {

 public void Send() {

  try {

   ServerSocket ss = new ServerSocket(5311);
   Socket s2 = ss.accept();

   System.out.println(“Hallo Heimur”);
   PrintWriter pwriter2 = new PrintWriter(s2.getOutputStream());

   pwriter2.println("Hallo fra Heiminum!");
   pwriter2.close();
   
						
   } catch (IOException ex) {

	ex.printStackTrace();
      }
   }

  public static void main(String[] args) {
      
      City city = new City();
      city.Send();
		
 }
}
