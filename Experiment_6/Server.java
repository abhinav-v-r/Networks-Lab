import java.net.*;

public class Server{
	public static void main(String[] args) throws Exception{
		DatagramSocket s = new DatagramSocket(5000);
		System.out.println("Server started...");
		byte[] b = new byte[1024];
		DatagramPacket p = new DatagramPacket(b,b.length);
		s.receive(p);
		String msg = new String(p.getData(),0,p.getLength());
		System.out.println("Sentence Received");
		System.out.println("Translating...");
		msg=msg.replace("tbh","to be honest")
		.replace("idc","I don't care")
		.replace("ig","I guess")
		.replace("tbf","to be fair")
		.replace("atm","at the moment")
		.replace("irl","in real life")
		.replace("lol","laugh out loud")
		.replace("asap","as soon as possible")
		.replace("omg","Oh my god")
		.replace("ttyl","talk to you later")
		.replace("idk","I don't know")
		.replace("nvm","never mind");
		
		b=msg.getBytes();
		System.out.println("Sending back translated sentence...");
		s.send(new DatagramPacket(b,b.length,p.getAddress(),p.getPort()));
		s.close();	
	}
}
