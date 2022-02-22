package IO;
import java.util.*;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class nuffer_output {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//FileOutputStream fout=new FileOutputStream("C:\\Selvi\\IO\\test.txt");
		FileOutputStream fout=new FileOutputStream("C:\\Selvi\\IO\\test1.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="Welcome to javaTpoint.";    
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();    
		bout.close();    
		fout.close();    
		System.out.println("success");    
		
		
	}

}
