package concepts.socketbasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientCode {

	public static void main(String[] args) throws UnknownHostException,
			IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("127.0.0.1", 8775);
		InputStream in = s.getInputStream();// To read from the server
		OutputStream out = s.getOutputStream();// To write to the server
		String h = "hello\n";
		byte[] buffer = h.getBytes();
		out.write(buffer);
		int character = in.read();
		System.out.println("Client code");
		while (character != -1) {
			System.out.println("Nothing to print here" + (char) character);
		}
		s.close();
	}

}
