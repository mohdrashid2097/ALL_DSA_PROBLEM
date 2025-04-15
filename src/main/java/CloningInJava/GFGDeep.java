package CloningInJava;

public class GFGDeep implements Cloneable {
	
	// creating clone method here
	public Object clone() throws CloneNotSupportedException
	{
		return (GFGDeep) super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// this is the example of deep cloning in java
		GFGDeep t1 = new GFGDeep();
		GFGDeep t2 = (GFGDeep)t1.clone();
		System.out.println(t1==t2);  //false
	}

}
