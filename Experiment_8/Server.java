import java.net.*;
import java.util.Date;

public class Server{
	public static void main(String[] args) throws Exception{
		DatagramSocket s = new DatagramSocket(5000);
		System.out.println("Time Server started...");
		byte[] b = new byte[1024];
		DatagramPacket p = new DatagramPacket(b,b.length);
		s.receive(p);
		String time = new Date().toString();
		byte[] out = time.getBytes();
		DatagramPacket res = new DatagramPacket(out,out.length,p.getAddress(),p.getPort());
		s.send(res);
		System.out.println("Sent time to " + p.getAddress());
	}
}
