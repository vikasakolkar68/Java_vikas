package logical_programs;

public class reversestring {

	public static void main(String[] args) {
		
		String name1="Archana Akolkar";
		String name2="";
		
		for(int x=name1.length()-1;x>=0;x--) {
		name2=name2+name1.charAt(x);
		
	}
		System.out.println(name2);
	}
}
