package Java_Collections;
import java.util.*;

public class HashSet_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		set.add(null);
		set.add(null);
		//Traversing elements  
		Iterator i=set.iterator();  
		while(i.hasNext()){  
		System.out.println(i.next());  
		}

	}

}
