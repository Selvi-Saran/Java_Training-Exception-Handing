package IO;
import java.io.*;

public class FilereadWrite_Buffer {
	public static void main(String[] args) throws IOException{
	FileWriter w = new FileWriter("C:\\Selvi\\IO\\file_write_io.txt");  
	BufferedWriter b1 = new BufferedWriter(w);
    String msg = "This is the example of buffer write calss";  
    b1.write(msg);
    b1.close();
   
    System.out.println("Done");  
    
    Reader reader = new FileReader("C:\\Selvi\\IO\\file_write.txt");  
    int data = reader.read();  
    while (data != -1) {  
        System.out.print((char) data);  
        data = reader.read();  
    }  
    reader.close();
	}
	
}
