package example.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int size;
		try
		{
		FileInputStream fileinputstream = new FileInputStream(
				"FileInputStreamDemo.java");
		byte byteArray[] = new byte[100];
		System.out.println("available bytes:" + fileinputstream.available());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
