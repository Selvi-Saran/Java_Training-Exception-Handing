package IO;
import java.io.*;

public class char_array {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 char[] arr = {'h','e','l','l','o','w','o','r','l','d'};  
		    CharArrayReader r = new CharArrayReader(arr);  
		    int k = 0;  
		 
		    while ((k = r.read()) != -1) {  
		      char ch = (char) k;  
		      System.out.print(ch + " : ");  
		      System.out.println(k);  
		    }
		    
		    CharArrayWriter w=new CharArrayWriter();    
	         w.write("char array writer example"); 
	         
	         FileWriter f1=new FileWriter("C:\\Selvi\\IO\\char_f1.txt");    
	         FileWriter f2=new FileWriter("C:\\Selvi\\IO\\char_f2.txt");    
	         FileWriter f3=new FileWriter("C:\\Selvi\\IO\\char_f3.txt");    
	         FileWriter f4=new FileWriter("C:\\Selvi\\IO\\char_f4.txt");    
	          
	         
	         w.writeTo(f1);  w.writeTo(f2);w.writeTo(f3);  w.writeTo(f4);      
	         
	               
	           
	          f1.close(); f2.close();f3.close(); f4.close();    
                 
	          
	        

	}

}
