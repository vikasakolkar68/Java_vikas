package logical_programs;



public class factorial {

	public static void main(String[] args) {

		int num=10559, fact=1;
		
		for(int i=0; i<=num; i++) {
			fact=fact*i;
			
		}
		System.out.println("The Factorial of the number "+num +" is :" +fact);


	}

}
