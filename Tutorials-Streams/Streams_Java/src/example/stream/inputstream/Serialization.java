package example.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NewString inObject,outObject;
inObject=new NewString("");
outObject=new NewString("Hello from Java!");
try
{
	FileOutputStream fileoutputstring=new FileOutputStream("E:/Java Eclipse/Streams_Java/src/example/stream/inputstream/serialized.dat");//fileoutputstring is the output stream
	ObjectOutputStream objectoutputstream=new ObjectOutputStream(fileoutputstring);//objectoutstream is the object that writes to the output stream
	objectoutputstream.writeObject(outObject);
	objectoutputstream.flush();
	objectoutputstream.close();
	FileInputStream fileinputstring=new FileInputStream("E:/Java Eclipse/Streams_Java/src/example/stream/inputstream/serialized.dat");
	ObjectInputStream objectinputstream=new ObjectInputStream(fileinputstring);
	inObject=(NewString)(objectinputstream.readObject());
	System.out.println(inObject.toString());
	objectinputstream.close();
}
catch(Exception e)
{
	System.out.println(inObject);
}
	}
}
