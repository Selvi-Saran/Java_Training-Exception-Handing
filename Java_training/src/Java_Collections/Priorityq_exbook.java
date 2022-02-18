package Java_Collections;
import java.util.*;
class Book2 implements Comparable<Book2>{  
int id;  
String name,author,publisher;  
int nos;  
public Book2(int id, String name, String author, String publisher, int nos) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.nos = nos;  
}  
public int compareTo(Book2 b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    
    	 return 0;  
    }  
} 
}  

public class Priorityq_exbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<Book2> queue=new PriorityQueue<Book2>();  
		   
		 //Creating Books  
		    Book2 b1=new Book2(101,"Nenjil oru mul","M.V.Varattharasanar","BPB",8);  
		    Book2 b2=new Book2(102,"Diary of the whimpy kid","Selvi","Anjugam pathipagam",4);  
		    Book2 b3=new Book2(103,"Artificial Intelligence","Krish","neur",6);  
		    
		    //Adding Books to the queue  
		    queue.add(b1);  
		    queue.add(b2);  
		    queue.add(b3);  
		    System.out.println("\n"+"After Added"); 
		    
		    //Traversing queue elements  
		    for(Book2 b:queue){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.nos);  
		    }  
		    
		    //remove a record
		    queue.remove();  
		    queue.poll();
		    System.out.println("\n"+"After removing book record:");  
		    for(Book2 b:queue){  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.nos);  
		        }  

	}

}
