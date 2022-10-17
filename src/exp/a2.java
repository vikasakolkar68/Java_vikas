package exp;

public class a2 {

	public static void main(String[] args) {
		
		try {
			int a=89;
			int b=5;
			
			  float c=a/b;
			
			System.out.println(c);
		}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			finally {
			 
			System.out.println("cleanup code");
			}
		}

	}


