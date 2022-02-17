package Multithreading;
import java.util.*;

public class thread_runnable implements Runnable {
	public void run()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the value:");
		int n=s.nextInt();
		
		for(int i=0;i<20;i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread_runnable r=new thread_runnable();
		Thread t=new Thread(r,"My new thread");
		t.start();
		System.out.println(t.getName());

	}

}
