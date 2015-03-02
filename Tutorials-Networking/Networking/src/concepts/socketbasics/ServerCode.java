package concepts.socketbasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket socket = new ServerSocket(8775);// Server creates socket
														// that binds a
														// connection to port
		Socket insocket = socket.accept();// Used to accept incoming client
											// connection.Creates a socket that
											// has teh same address as that of
											// the client that call's.
		System.out.println("Hello " + socket.getLocalPort());
		BufferedReader in = new BufferedReader(new InputStreamReader(
				insocket.getInputStream()));
		PrintWriter out = new PrintWriter(insocket.getOutputStream(), true);
		String instaring = in.readLine();
		System.out.println(instaring);
		out.println("The server got this" + instaring);

		insocket.close();
		socket.close();
		socket = null;

	}

}
