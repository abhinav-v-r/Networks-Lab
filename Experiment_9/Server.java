import java.io.*;
import java.net.*;

public class Server{
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(5000);
		System.out.println("File Server Started. PID= " + ProcessHandle.current().pid());
		Socket cs = ss.accept();
		new Thread(() -> handle(cs)).start();
	}
	
	static void handle(Socket cs){
		try{
			BufferedReader in = new BufferedReader(
			new InputStreamReader(cs.getInputStream()));
			PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
			String fname = in.readLine();
			File f = new File(fname);
			out.println("PID= " + ProcessHandle.current().pid());
			if(f.exists()){
				BufferedReader fr = new BufferedReader(new FileReader(f));
				String line;
				while((line=fr.readLine()) != null) out.println(line);
				System.out.println("File sent");
				fr.close();
			}
			else{
				out.println("ERROR: File not found!");
			}
			cs.close();
		}catch (Exception e){ e.printStackTrace();}
	}

}
