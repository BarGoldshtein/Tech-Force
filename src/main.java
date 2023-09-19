import Client;
import Server;
public class main {

	public static void main(String[] args)
	{

		config conf = new config();
		trans translate = new trans(conf);
		Client client = new Client();
		client.run();
		Server server = new Server();
		server.run();


	}
}
