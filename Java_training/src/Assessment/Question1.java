package Assessment;
class Animal{
	 void walk(){
	 System.out.println("I am walking");
	 }}
class Bird extends Animal {
	 void fly() 
	 {
	 System.out.println("I am flying");
	 }
	 
	 void sing()
	 {
		System.out.println("I am singing"); 
	 }
	}
	

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bird bird = new Bird();
		 bird.walk();
		 bird.fly();
		 bird.sing();
		 

	}

}
