package Exception_handling;
import java.io.*;

public class throws_ex {
	void M()throws IOException
	{
		System.out.println("Device operation is performed");
	}
	void M1()throws ClassNotFoundException
	{
		System.out.println("Class not found exception");
	}

	public static void main(String[] args) throws IOException,ClassNotFoundException
	{
		// TODO Auto-generated method stub
		throws_ex e=new throws_ex();
		e.M();
		e.M1();
		System.out.print("Normalflow");

	}

}
