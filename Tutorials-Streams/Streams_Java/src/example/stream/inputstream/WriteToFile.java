package example.stream.inputstream;

import java.io.*;

public class WriteToFile {
	public static void main(String[] args) {

		// The name of the file to open.
		String fileName = "temp2.txt";

		try {

			File file = new File(fileName);

			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}
			// Assume default encoding.
			FileWriter fileWriter = new FileWriter(fileName);

			// Always wrap FileWriter in BufferedWriter.
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			// Note that write() does not automatically
			// append a newline character.
			bufferedWriter.write("Hello there,");
			bufferedWriter.write(" here is some text.");
			bufferedWriter.newLine();
			bufferedWriter.write("We are writing");
			bufferedWriter.write(" the text to the file.");

			// Always close files.
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
	}
}
