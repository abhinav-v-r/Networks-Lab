import java.net.*;
import java.util.*;

public class Client{
	public static void main(String[] args) throws Exception{
		DatagramSocket ds = new DatagramSocket();
		InetAddress ip = InetAddress.getByName("localhost");
		byte[] out = "TIME_REQUEST".getBytes();
		ds.send(new DatagramPacket(out,out.length,ip,5000));
		
		byte[] out = "TIME_REQUEST".getBytes();
		DatagramPacket req = new DatagramPacket(out,out.length,ip,5000);
		long startTime=System.nanoTime();
		ds.send(req); //waiting
		
		String time = new String(res.getData(),0,res.getLength());
		System.out.println("Server time: " + time);
		ds.close();
	}
} 
