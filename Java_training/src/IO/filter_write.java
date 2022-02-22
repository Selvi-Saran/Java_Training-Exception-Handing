package IO;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.FileReader;
import java.io.BufferedReader;



class UserFilterWriter extends filter_write 
{  
	UserFilterWriter(Writer out) {  
        super();  
    }  
    public void write(String str) {  
        super.write(str.toLowerCase());
    }  
}  

public class filter_write {

	public static void main(String[] args)throws IOException, Exception{
		// TODO Auto-generated method stub
	  
	     FileWriter fw = new FileWriter("C:\\Selvi\\IO\\filter_Write.txt"); 
	     
	     UserFilterWriter cf= new UserFilterWriter(fw);             
	     cf.write("Hello World");  
	     cf.clone(); 
	     
	     FileReader fr = new FileReader("C:\\Selvi\\IO\\filter_Write.txt");  
	     BufferedReader br= new BufferedReader(fr);  
	     int k;  
	     while ((k = br.read()) != -1)
	     {  
	                System.out.print((char) k);  
	      }  
	     
	       br.close();     

	}

	public void write(String lowerCase) {
	
	}

	
		
}




