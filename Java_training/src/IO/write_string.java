package IO;

import java.io.FileOutputStream;

public class write_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		FileOutputStream fout=new FileOutputStream("C:\\Selvi\\IO\\test1.txt"); 	
		String s="Welcome to my house";
		byte b[]=s.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("Success..");
		}catch(Exception e){System.out.println(e);}

	}

}
