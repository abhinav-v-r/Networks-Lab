import java.net.*;
import java.util.*;

public class Client{
	public static void main(String[] args) throws Exception{
		DatagramSocket ds = new DatagramSocket();
		InetAddress ip = InetAddress.getByName("localhost");
		
		Scanner sc = new Scanner(System.in);
		byte[] b = new byte[1024];
		
		System.out.println("Enter the sentence: ");
		
		String input = sc.nextLine();
		
		b = input.getBytes();
		DatagramPacket dp = new DatagramPacket(b,b.length,ip,5000);
		ds.send(dp);
		
		b = new byte[1024];
		dp = new DatagramPacket(b,b.length);
		ds.receive(dp);
	
		String serverResponse = new String(dp.getData(),0,dp.getLength());
		
		System.out.println("Translated Sentence: " + serverResponse);
		
	}
}
