package Java_Collections;
import java.util.*;

public class treeset_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set=new TreeSet();  
        set.add("Anbu");  
        set.add("Balu");  
        set.add("Cauvs");  
        set.add("Cauvs");
        set.add("Daniel");  
        set.add(null); 
        System.out.println("Initial Set:"+set);
        
        set.remove("Balu");
        System.out.println("\n"+"After Remove()"+set);
        TreeSet<String> set1=new TreeSet(); 
        set1.add("Selvi");
        set1.add("Henry");
        set.addAll(set1);
        System.out.println("\n"+"After addall set1()"+set);
        set.removeAll(set1);
        System.out.println("\n"+"After removeAll set1()"+set);
        set.removeAll(set);
        System.out.println("\n"+"After removeAll set1()"+set);

	}

}
