package a1_conditionalstatement;

public class Ladder {

	public static void main(String[] args) {
		
		int a=60;
		int b=5;
		int c=50;
		// in this if first condition gets true, then only first condition is printed in console.
		// if first condition is gets false, then second condition if it is true, then it will execute.
		// if first and second both are false, then third condition if it is true, then it will execute.
		// if all the conditions are false, then else condition will get execute.
	 if(a<b) {
		 System.out.println("a is less than b");
	 }
	 else if(a<c) {
		 System.out.println("a is also less than c");
	 }
	 else if(c>a) {
		 System.out.println("c is greater than a");
	 }
	 else {
		 System.out.println("i am in else block");
	 }
		

	}

}
