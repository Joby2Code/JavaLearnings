package concepts.URLclass;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class URIClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL obj = new URL(
					"http://www.adobe.com/products/catalog/software.html");
			System.out.println("File:" + obj.getFile() + " Patht:"
					+ obj.getPort() + "Protocol " + obj.getProtocol()
					+ " \n URL " + obj.toURI());
		} catch (MalformedURLException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
