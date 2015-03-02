package concepts.socketbasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketDemo {// Client socket Program: Couldn't understand it
							// completely

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s = new Socket("www.adobe.com", 80);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			PrintWriter out = new PrintWriter(s.getOutputStream());
			out.print("GET /products/catalog/software.html \n\n\n\n\n\n");
			out.flush();
			out.print("Hello");
			/*
			 * String line = in.readLine(); while (line != null) {
			 * System.out.println(line); }
			 */
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
