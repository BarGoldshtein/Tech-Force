

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Thread {


	public void run(){
		System.out.println("Starting Client");
		try {
			//
			// Create a connection to the server socket on the server application
			//
			
				InetAddress host = InetAddress.getLocalHost();
			Socket socket = new Socket(host.getHostName(), 5600);
		
			//
			// Send a message to the client application
			//
			DataOutputStream dos = new DataOutputStream(
					socket.getOutputStream());
			
				DataInputStream dis = new DataInputStream(System.in);
		
			String line = "";
			while (!line.equals("bye"))
			{  
			   try
			   {  
				line = dis.readLine();
					dos.writeUTF(line);
				dos.flush();
			   }
			   catch(IOException ioe)
			   {  
				System.out.println("Sending error: " + ioe.getMessage());
						}
			   }
			   
				   dis.close();
			   dos.close();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		   
	 }
   
}

 

