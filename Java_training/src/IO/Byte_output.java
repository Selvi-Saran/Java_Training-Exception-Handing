package IO;
import java.util.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;

public class Byte_output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
		FileOutputStream f1=new FileOutputStream("C:\\Selvi\\IO\\byte_f1.txt");    
	    FileOutputStream f2=new FileOutputStream("C:\\Selvi\\IO\\byte_f2.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(65);    
	      bout.writeTo(f1);    
	      bout.writeTo(f2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
	      System.out.println("Success...");  
		}catch(Exception e) {System.out.println(e);}
		
	}

}
