package concetps.inetbasics;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class DnsResolution {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub

		String host;

		do {
			System.out.println("Please enter the host name");
			host = sc.nextLine();
			try {
				InetAddress[] address = InetAddress.getAllByName(host);

				for (InetAddress ip : address) {
					System.out.println("The ip address is " + ip.toString());
				}

			} catch (UnknownHostException e) {
				System.out.println("The host " + host
						+ " could not be found Please try again");
			}
		} while (doAgain());

	}

	public static boolean doAgain() {
		System.out.println("Would you like to continue");
		String choice;
		// boolean choice2 = true;
		choice = sc.nextLine();
		if (choice.equalsIgnoreCase("Y"))
			return true;
		else if (choice.equalsIgnoreCase("N")) {
			System.out.println("Please do visit us again");
			return false;
		} else {
			System.out.println("Please enter the right character to continue");
			doAgain();
		}
		return true;
	}
}