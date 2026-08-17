import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client{
	public static void main(String[] args) throws Exception{
		Socket ds = new Socket("localhost",5000);
		Scanner sc = new Scanner(System.in);
		
		PrintWriter out = new PrintWriter(ds.getOutputStream(),true);
		BufferedReader in = new BufferedReader(new InputStreamReader(ds.getInputStream()));
		
		System.out.println("Connected to chat! Enter your username: ");
		String name = sc.nextLine();
		
		// Separate Thread
		Thread listener = new Thread(() -> {
			try{
				String inmsg;
				while((inmsg = in.readLine()) != null){
					System.out.println(inmsg);
				}
			}
			catch(IOException e) {
				System.out.println("Connection to server closed.");
			}
		});
		listener.start();
		
	
	System.out.println("Start typing messages(type 'exit' to quit):");
	while(true){
		String msg = sc.nextLine();
		if (msg.equalsIgnoreCase("exit")){
			break;
		}
		out.println(name + ":" + msg);
	}		

	}
}


