import java.net.*;
import java.io.*;

public class Client{
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("localhost",5000);
		BufferedReader kb = new BufferedReader(
		new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		BufferedReader in = new BufferedReader(
		new InputStreamReader(s.getInputStream()));
		
		System.out.println("Enter file name: ");
		out.println(kb.readLine());
		
		String line;
		while((line = in.readLine()) != null)
		System.out.println(line);
		s.close();
	}
}
