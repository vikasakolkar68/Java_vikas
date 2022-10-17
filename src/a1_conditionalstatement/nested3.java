package a1_conditionalstatement;

public class nested3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		int c=5;
		
		if(a<b) {
		System.out.println("a is less than b");
		if(a<c) {
		System.out.println("a is less than c");
		
	}
		else {
			System.out.println("a is greter than c");
		}
}
		else {
			System.out.println("a is greater than b & c");
			
		}
	}
}
