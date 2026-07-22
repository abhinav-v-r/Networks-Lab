import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception{
			Socket s = new Socket("localhost",5000);
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			DataInputStream in = new DataInputStream(s.getInputStream());
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter order of the square matrix: ");
			int n = sc.nextInt();
			
			int[][] matrix = new int[n][n];
		
			System.out.println("Enter Matrix: ");
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					matrix[i][j] = sc.nextInt();
				}
			}
			out.writeInt(n);
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					out.writeInt(matrix[i][j]);
				}
			}
		System.out.println("Result: "+ in.readUTF());
		out.close();
		in.close();
		sc.close();
		s.close();
		
		}
} 
