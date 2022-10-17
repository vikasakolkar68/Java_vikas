package Overloading;

public class a_2 {
	
	public void m1(String B,int c) {
		System.out.println("hello");
	}
	public void m1(int C,String D) {
		System.out.println("hello");
	}
	

	public static void main(String[] args) {
		
		a_2 aa=new a_2();
		aa.m1(null, 0);
        aa.m1(0, null);
		
		
	}

}
