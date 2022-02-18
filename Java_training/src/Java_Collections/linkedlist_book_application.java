package Java_Collections;
import java.util.*;
class Book {  
int id;  
String name,author,publisher;  
int nos;  
	public Book(int id, String name, String author, String publisher, int nos)
	{  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.nos = nos;  

	}
}

public class linkedlist_book_application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Book> list=new LinkedList();  
		    //Creating Books  
		    Book b1=new Book(101,"Nenjil oru mul","M.V.Varattharasanar","BPB",8);  
		    Book b2=new Book(102,"Diary of the whimpy kid","Selvi","Anjugam pathipagam",4);  
		    Book b3=new Book(103,"Artificial Intelligence","Krish","neur",6);  
		    //Adding Books to list  
		    list.add(b1);  
		    list.add(b2);  
		    list.add(b3);  
		    //Traversing list  
		    for(Book b:list){  
		    System.out.println(b.id+"\t"+b.name+"\t"+b.author+" \t"+b.publisher+"\t"+b.nos);  
		    }  
		
	}

}
