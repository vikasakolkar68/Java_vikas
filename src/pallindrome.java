
public class pallindrome {

	public static void main(String[] args) {
		
	int a=987;
	int b=a;
	
	int rem;
	int rev=0;
	
	while (b!=0) {
		rem=b%10;
		rev=rev*10+rem;
		b=b/10;
	}
		System.out.println(rev);
		
		
		
	}
}
