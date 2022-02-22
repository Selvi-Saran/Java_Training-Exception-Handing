package IO;
import java.util.*;
import java.io.File;  
import java.io.PrintWriter;  

public class print_writer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		PrintWriter pw= new PrintWriter(System.out);    
	    pw.write("Data can be printed using print-writer");        
	    pw.flush();  
	    pw.close();  

  
	    PrintWriter pw1 =null;
	    	pw1=new PrintWriter(new File("C:\\Selvi\\IO\\print_write.txt")); 
	         
	         pw1.write("this is for print writer example");                                                   
	         pw1.flush();  
	         pw1.close();  

	}

}
