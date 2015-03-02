package example.stream.inputstream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte data[] = "The specimen was #5 in the series#comment_goes_here#"
				.getBytes();
		/*
		 * for (int i = 0; i < data.length; i++) { // System.out.println(i);
		 * System.out.println(i + " " + data[i]); }
		 */

		ByteArrayInputStream in = new ByteArrayInputStream(data);
		BufferedInputStream bufferedinputstream = new BufferedInputStream(in);
		int character = bufferedinputstream.read();
		System.out.println(character);
		boolean silentflag = false;
		// int character;
		while (character != -1) {
			switch (character) {
			case '#':
				if (silentflag) {
					silentflag = false;
				} else {
					silentflag = true;

					bufferedinputstream.mark(0);
					System.out.println((char) character + "Test character");
				}
				break;

			case ' ':
				if (silentflag) {
					silentflag = false;
					System.out.println("No test");
					bufferedinputstream.reset();
				} else {
					System.out.println((char) character);

				}
				break;
			default:
				if (!silentflag)
					System.out.println((char) character);
			}
			character = bufferedinputstream.read();
		}

	}

}
