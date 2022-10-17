package Overriding;

class prt{
	 public void grt(int c, String a) {  // type of argument should same
		 System.out.println("hello");
	 }
}

class b11 extends prt {

	public void grt(int c, String a) {  // type of argument should same
		System.out.println("hi");
	}
	 
	public static void main(String[] args) {
		
		b11 b=new b11();
		b.grt(10,"");
	}

}
