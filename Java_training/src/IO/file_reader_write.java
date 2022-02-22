package IO;
import java.io.*;

public class file_reader_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	 
            Writer w = new FileWriter("C:\\Selvi\\IO\\file_write.txt");  
            String msg = "This is the example of write calss";  
            w.write(msg);  
            w.close();  
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
