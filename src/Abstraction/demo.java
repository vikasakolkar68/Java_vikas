package Abstraction;

interface inter{
	
	// in java 8 version 
	
	default void m1() {
		System.out.println("i am default method");
	}
	
	static void m2(){     // by default consider public
	System.out.println("static method");	
	}
	
	// java 9th version
	private void m3() {    // allows private method
		System.out.println("private method");
	}
}

interface inter1{
public class demo implements inter,inter1 {         // multiple inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




}