package logical_programs;

public class pallindrome_number {

	public static void main(String[] args) {
		
		int a=137;
		int b=a;   //     reverse the number
		
		int rem;
		int rev=0;
		
		while(b!=0) {
			
			rem=b%10;
			rev=rev*10+rem;
			b=b/10;
			
			
		}
		//if(a==rev) {
			//System.out.println(a+ " is a pallindrome number");
		//}
		//else {
			//System.out.println(a+ " is not a pallindrome number");
		//}
		
		System.out.println(rev);

	}

}
