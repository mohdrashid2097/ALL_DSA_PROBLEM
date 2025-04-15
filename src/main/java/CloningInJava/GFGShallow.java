package CloningInJava;

public class GFGShallow implements Cloneable{

	public static void main(String[] args) {
		// this is an example of shallow cloning in java
		GFGShallow t1 = new GFGShallow();
		GFGShallow t2 = t1;
		System.out.println(t1==t2); // return true means shallow cloning
		
	}

}
