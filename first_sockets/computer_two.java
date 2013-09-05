import java.io.*;
import java.net.*;

public class Camp {
	
 public void  sendMsg() {

  try {

   Socket s1 = new Socket("IP address of City computer", 10000);
   InputStreamReader streamreader1 = new InputStreamReader(                                                                                                    s1.getInputStream());

   BufferedReader reader1 = new BufferedReader(streamreader1);

   String msgFromCity = reader1.readLine();
   System.out.println(msgFromCity);
   reader1.close();
			
    } catch (IOException ex) {
	     
       ex.printStackTrace();
  }
 }
 
 public static void main(String[] args) {
    
    Camp camp = new Camp();
    camp.sendMsg();
 }
}
