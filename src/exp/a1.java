package exp;

public class a1 {

	public static void main(String[] args) {
		
		try {
		int a=1;
		int b=0;
		
		int c=a/b;
		
		System.out.println(c);
	}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
		 
		System.out.println("cleanup code");
		}
	}
}
