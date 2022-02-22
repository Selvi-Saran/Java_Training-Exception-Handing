package IO;
import java.io.*;
import java.io.DataInputStream;
public class data_output {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file=new FileOutputStream("C:\\Selvi\\IO\\DataOut.txt");
		DataOutputStream dos = new DataOutputStream(file);
		dos.writeInt(123);
		dos.writeFloat(1234.3f);
		dos.writeLong(12324455);
		dos.close();
		
		InputStream input = new FileInputStream("C:\\Selvi\\IO\\DataOut.txt");  
		DataInputStream dis=new DataInputStream(input);
		int int123=dis.readInt();
		float float123=dis.readFloat();
		float long123=dis.readLong();
		
		System.out.println("integers are:"+int123);

		System.out.println("Float are:"+float123);

		System.out.println("Long are:"+long123);
		
		System.out.println("Success");
		

	}

}
