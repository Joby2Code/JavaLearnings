package example.stream.inputstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader obj = new FileReader(
				"E:/Java Eclipse/Streams_Java/src/example/stream/inputstream/filereadedemo.txt");
		char[] data = new char[10];
		data[0] = 'C';
		System.out.println(data[0]);
		System.out.println("The character is " + (obj.read(data)));
		int charread = obj.read(data);
		System.out.println(charread);
		System.out.println((new String(data, 0, charread)));
		obj.close();
		char[] data2 = { 'T', 'H', 'i', 's' };
		FileWriter obj2 = new FileWriter(
				"E:/Java Eclipse/Streams_Java/src/example/stream/inputstream/filewrite3.txt");
		obj2.write(data2);
		FileWriter obj3 = new FileWriter(
				"E:/Java Eclipse/Streams_Java/src/example/stream/inputstream/filewrite2.txt");
		obj2.write(data, 1, 3);
		obj2.close();
		obj3.close();
	}

}
