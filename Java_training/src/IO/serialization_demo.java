package IO;
import java.io.Serializable;  
import java.io.*;

class Student implements Serializable{    
	int id;    
	String name;  
	String course;
	int fees;
	Student(int id, String name,String course,int fees)
	{    
		this.id = id;    
		this.name = name;  
		this.course=course;
		this.fees=fees;
	}    
}    



public class serialization_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{    
			  //Creating the object    
			  Student s1 =new Student(211,"ravi","Engineering",50000);    
			   
			  FileOutputStream fout=new FileOutputStream("C:\\Selvi\\IO\\student.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(s1);    
			  out.flush();    
			  //closing the stream    
			  out.close();    
			  System.out.println("object ouput stream is done successfully");    
			  }catch(Exception e)
		 		{
				  System.out.println(e);
				 }   
		 
			  try{    
			  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Selvi\\IO\\student.txt"));    
			  Student s=(Student)in.readObject();    
			
			  System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fees);    
			  
			  in.close();   
			  System.out.println("object Input stream is done successfully");
			  }catch(Exception e)
			  {
				 System.out.println(e);
			  } 
			  

	}

}
