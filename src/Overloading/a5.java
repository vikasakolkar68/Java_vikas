package Overloading;

public class a5 {
	
	
	public void m1(int a) {
		System.out.println("m1");
	}
	public void m1(int...b) {          // var arguments- we can add multiple arguments in it.
		System.out.println("Hello");
	}
	
	

	public static void main(String[] args) {
		
		a5 o=new a5();
		o.m1(4,7,7,8);

	}

}
