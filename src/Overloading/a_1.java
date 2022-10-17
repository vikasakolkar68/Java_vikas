package Overloading;

    // overloading method

public class a_1 {

	public void username(String emailid) {
		
		System.out.println(emailid);

	}
	
	public void username(int mobileno) {
		System.out.println(mobileno);
	}
	
	public static void main(String[] args) {
		
	
		a_1 a=new a_1();
		a.username("12345");
		a.username("vikasakolkar@gmail.com");

	}

}
