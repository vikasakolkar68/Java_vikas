package Abstraction;

abstract class fruit{
	
	abstract void taste();
	
	
	class apple extends fruit{
	
	void taste() {
		System.out.println("taste is sweet");
	}
	
	
}

public class mango extends fruit {
	
	void taste() {
		System.out.println("taste is sour");
	}
	

	public static void main(String[] args) {
		
		mango mango=new mango();
		mango.taste();

		apple apple=new apple();
		apple.taste();
	}

}}
