package IO;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

class UserFilterReader extends filter_reader 
{
	UserFilterReader(Reader in)
	{
		super();
	}
	public int read()
	{
		int x=super.read();
		if((char)x==' ')
			return((int)'?');
		else
			return x;
	}
	
}



public class filter_reader {

	

	public int read() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try
		{
			Reader reader=new FileReader("C:\\Selvi\\IO\\print_write.txt");
			UserFilterReader ufr=new UserFilterReader(reader);
			int i;
		
			while ((i =ufr.read()) != -1) {  
                System.out.print((char) i);  
            }  
            ufr.clone(); 
            reader.close();  
					
		}catch (Exception e) {  
            e.getMessage(); 
		}

	}

}
 
  
         