package a1_loopingstatement;

import java.util.Scanner;

public class inputfromuser {

	public static void main(String[] args) {
		
		System.out.println("enter the first number");
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		System.out.println("enter the second number");
		Scanner k=new Scanner(System.in);
		int b=k.nextInt();
		
		int c=a+b;
		System.out.println(c);

	}

}
