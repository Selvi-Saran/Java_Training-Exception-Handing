package Java_Collections;
import java.util.*;

public class map_desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(10050,"Amit");    
	      map.put(134,"Vijay");    
	      map.put(1022,"Rahul"); 
	      map.put(1021,"selvi");  
	      
	      //Ascending comparingByKey method
	      System.out.println("Ascending Comparingbykey method");
	      map.entrySet()
	      .stream()
	      .sorted(Map.Entry.comparingByKey())
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);
	      
	      //Descending comparingByKey method
	      System.out.println("\n"+"Descending Comparingbykey method");
	      map.entrySet()  
	     
	      .stream()  
	     
	      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
	      
	      .forEach(System.out::println);  
	      
	      //Ascending Comparingbyvalue method
	      System.out.println("\n"+"Ascending Comparingbyvalue method"+"/n");
	      map.entrySet()  
	     
	      .stream()  
	     
	      .sorted(Map.Entry.comparingByValue())  
	     
	      .forEach(System.out::println);  
	     
	      
	      //Descending Comparingbyvalue method
	      System.out.println("\n"+"Descending Comparingbyvalue method"+"/n");
	      map.entrySet()  
	     
	      .stream()  
	    
	      .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))  
	     
	      .forEach(System.out::println);  
	    
	      

	}

}
