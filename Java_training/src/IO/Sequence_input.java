package IO;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.*;



public class Sequence_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			FileInputStream in1=new FileInputStream("C:\\Selvi\\IO\\test.txt");    
			FileInputStream in2=new FileInputStream("C:\\Selvi\\IO\\test1.txt");    
			SequenceInputStream si=new SequenceInputStream(in1, in2);    
			
			int j;
			while((j=si.read())!=-1){    
				System.out.print((char)j);    
			}    
		  
			si.close();    
			in1.close();    
			in2.close();   
		}catch(Exception e) {System.out.println(e);}

	}

}
