package IO;
import java.io.FileOutputStream;
import java.util.*;

public class File_outputStrem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fout=new FileOutputStream("C:\\Selvi\\IO\\FileOutput.txt");
			fout.write(90);
			fout.close();
			System.out.println("Succefully completed");
		}catch(Exception e) {System.out.println(e);}

	}

}
