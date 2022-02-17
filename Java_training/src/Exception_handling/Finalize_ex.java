package Exception_handling;

public class Finalize_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalize_ex f=new Finalize_ex();
		System.out.println("Hashcode is:"+f.hashCode());
		f=null;
		System.gc();
		System.out.println("End of the Garbage Collection");
				

	}
	protected void finalize()
	{
		System.out.println("Called finalize method");
	}

}
