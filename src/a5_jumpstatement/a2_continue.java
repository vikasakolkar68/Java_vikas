package a5_jumpstatement;

public class a2_continue {

	public static void main(String[] args) {
		
		for(int a=1; a<=100; a++) {
			
			if( a==12 || a==30 || a==50 || a==75) {   // if we dont want to execute this numbers
				
				continue;
			}
			System.out.println(a);
		}
		

	}

}
