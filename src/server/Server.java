package server;
import Utilitis.trans;


import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{

   private ServerSocket server;
   private int port = 5600;

   public Server() {
	   
      try {
	server = new ServerSocket(port);
      } catch (IOException e) {
	   e.printStackTrace();
	}
   }


   public void run(trans translate){
	Server server = new Server();
	server.connection(translate);
	System.out.println("Server running");
 }


   public void connection(trans translate ) {
	System.out.println("Waiting for client ...");
	try
	{
           Socket socket = server.accept();
	   System.out.println("Client accepted: " + socket);

	   DataInputStream dis = new DataInputStream(
		new BufferedInputStream(socket.getInputStream()));

	   boolean done = false;
	   while (!done)
	   {  
		try
		{  
	           String line = dis.readUTF();
	           String lang = line.substring(0, 1);
	           
		   System.out.println(translate.translate(line.substring(2) ,lang, "en"));
		   done = line.equals("bye");
		}
		catch(IOException ioe)
		{  
		   done = true;
		}
           }
	 	dis.close();				
		socket.close();
	   }
	   catch(IOException ioe)
	   {  
		System.out.println(ioe); 
	   }

    }
}
