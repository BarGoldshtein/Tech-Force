import Client.Client;
import server.Server;
import Utilitis.config;
import Utilitis.trans;

public class Run {

	
	public static void main(String[] args)
	{

		config conf = new config();
		trans translate = new trans(conf);
		Client client = new Client();
		client.run();
		Server server = new Server(translate);
		server.run();
		
		
		
	}
}
