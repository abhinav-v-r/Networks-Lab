import java.io.*;
import java.net.*;
import java.util.*;

public class Server{
	private static Set<PrintWriter> Writers = new HashSet<>();
	public static void main(String[] args) throws Exception{
		System.out.println("Chat Server is running on port" + 5000 + "...");
		
		ServerSocket ss = new ServerSocket(5000);
		while(true){
			Socket cs = ss.accept();
			System.out.println("A new user connected");
			
			new ClientHandler(cs).start();
		}
	}
	
	private static class ClientHandler extends Thread{
		private Socket socket;
		private PrintWriter out;
		private BufferedReader in;
		
		public ClientHandler(Socket socket) {
			this.socket = socket;
		}
		public void run(){
			try{
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),true);
			
			//Add to Global list
			synchronized (Writers){
				Writers.add(out);
			}
			
			String msg;
			while((msg = in.readLine()) != null){
				System.out.println("Log: " + msg);
				synchronized (Writers){
					for (PrintWriter writer : Writers){
						writer.println(msg);
					}	
			}	
			
			}
			
		} catch (IOException e){
			System.out.println("A user disconnected unexpectedly!");
		}
		finally{
			if (out!=null){
				synchronized(Writers){
					Writers.remove(out);
				}
			}
		}
		try{socket.close();} catch(IOException e){}
	}

}
}
