package example.stream.files;
//doesn't work
import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file1 = new File("file.txt");// To create a file instance
		File file2=new File("testFie.txt");
		System.out.println("File: "
				+ file1.getName()
				+ (file1.isFile() ? " is a file"
						: " is a named pipe or directory"));
		System.out.println(file1.toString());
		
		System.out.println("size:"+file1.length()+"path"+file1.getAbsolutePath()+" relativepath "+file1.getPath());
		System.out.println(file2.mkdir());
		
	}

}
