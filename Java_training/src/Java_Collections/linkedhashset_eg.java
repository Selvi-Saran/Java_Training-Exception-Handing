package Java_Collections;
import java.util.*;
import java.util.HashSet;
import java.util.Iterator;

public class linkedhashset_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet set=new LinkedHashSet();  
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
