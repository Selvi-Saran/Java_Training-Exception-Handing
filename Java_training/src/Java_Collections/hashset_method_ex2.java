package Java_Collections;
import java.util.*;

public class hashset_method_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book> set=new   HashSet();  
	    //Creating Books  object
	    Book b1=new Book(101,"Nenjil oru mul","M.V.Varattharasanar","BPB",8);  
	    Book b2=new Book (102,"Diary of the whimpy kid","Selvi","Anjugam pathipagam",4);  
	    Book b3=new Book(102,"Diary of the whimpy kid","Selvi","Anjugam pathipagam",4);
	    System.out.println("An initial list of elements: ");
	    set.add(b1);
	    set.add(b2);
	    set.add(b3);
	    for(Book b:set){  
		    System.out.println(b.id+"\t"+b.name+"\t"+b.author+" \t"+b.publisher+"\t"+b.nos);  
		  }  
	  //creating a set1
        HashSet<Book> set1=new HashSet();  
        Book b4=new Book(103,"Java Programming","Krish","abc",6);
        set1.add(b4);
      //add set1 values to set
        set.addAll(set1);  
        System.out.println("\n"+"Updated List: "); 
        for(Book b:set){  
		    System.out.println(b.id+"\t"+b.name+"\t"+b.author+" \t"+b.publisher+"\t"+b.nos);  
		  }  
	    

	}

}
