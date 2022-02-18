package Java_Collections;
import java.util.*;

public class hashset_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashSet<String> set=new HashSet();  
          set.add("Ravi");  
          set.add("Vijay");  
          set.add("Arun");  
          set.add("Arun");  
          System.out.println("An initial list of elements: "+set+"\n");  
          
          //Removing specific element from HashSet  
          set.remove("Ravi");  
          System.out.println("After invoking remove(object) method: "+set+"\n");  
          
          //creating a set1
          HashSet<String> set1=new HashSet<String>();  
          set1.add("Ajay");  
          set1.add("Gaurav"); 
         
          //add set1 values to set
          set.addAll(set1);  
          System.out.println("Updated List: "+set+"\n");  
          
          //Removing all the new elements from HashSet  
          set.removeAll(set1);  
          System.out.println("After invoking removeAll() method: "+set+"\n");  
         
          //Removing elements on the basis of specified condition  
          set.removeIf(str->str.contains("Vijay"));    
          System.out.println("After invoking removeIf() method: "+set+"\n");  
          
          //Removing all the elements available in the set  
          set.clear();  
          System.out.println("After invoking clear() method: "+set+"\n");  
	}

}
