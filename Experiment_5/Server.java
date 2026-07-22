import java.io.*;
import java.net.*;

public class Server{
	public static void main(String [] args) throws Exception{
		ServerSocket ss = new ServerSocket(5000);
		System.out.println("Server waiting");
		Socket s= ss.accept();
		System.out.println("Server connected");
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		DataInputStream in = new DataInputStream(s.getInputStream());
		int n = in.readInt();
		int matrix[][] = new int[n][n];
		for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					matrix[i][j] = in.readInt();
				}
			}
		boolean upper = true,lower=true,diagonal=true;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i>j && matrix[i][j] !=0) upper=false;
				if(i<j && matrix[i][j] !=0) lower=false;
				if(i!=j && matrix[i][j] !=0) diagonal=false;
			}
		}
		if(diagonal) 
			out.writeUTF("Diagonal Matrix");
		else if(upper) 
			out.writeUTF("Upper Triangualar Matrix");
		else if(lower) 
			out.writeUTF("Lower Triangualar Matrix");
		else 
			out.writeUTF("Not upper/lower/diagonal Matrix");
	
	s.close();
	ss.close();
	}	
	}
