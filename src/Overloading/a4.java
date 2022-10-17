package Overloading;

public class a4 {
	
	public void m1(int a) {
		
		System.out.println("int");
	}
	public void m1(String b) {
		System.out.println("String");
	}
	

	public static void main(String[] args) {
		
		a4 s=new a4();
		s.m1('c');   // char gets autotransforms into int.
        
	}

}
