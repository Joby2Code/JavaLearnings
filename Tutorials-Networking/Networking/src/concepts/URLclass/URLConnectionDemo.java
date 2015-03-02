package concepts.URLclass;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.*;
import java.util.Map;

public class URLConnectionDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL(
				"http://store1.adobe.com/svcs/references?country=US&locale=en_us");
		URLConnection uconn = url.openConnection();
		System.out.println("CT " + uconn.getContentType() + "\n Timeout: "
				+ uconn.getConnectTimeout() + " \n Content Encoding "
				+ uconn.getContentEncoding());
		System.out.println("All the header values");
		System.out.println("Expiration:" + uconn.getExpiration()
				+ "\n Content Type" + uconn.getContentType() + "\n Date: "
				+ uconn.getDate());
		for (int i = 0; i < 10; i++) {
			System.out.println("" + uconn.getHeaderField(i));
		}
		/*
		 * if (uconn.getContentLengthLong() > 0) { InputStream in =
		 * uconn.getInputStream(); int chacr = in.read(); while (chacr != 1) {
		 * System.out.println((char) chacr); chacr = in.read(); } }
		 */

	}
}
