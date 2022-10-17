package Overriding;

class part{
	 public void grt() {  // type of argument should same
		 System.out.println("hello");
	 }
}

public class b12 extends part {

	public void grt() {  // type of argument should same
		System.out.println("hi");
	}
	 
	public static void main(String[] args) {
		
		b12 b=new b12();
		b.grt();
	}

}