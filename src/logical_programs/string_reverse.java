package logical_programs;

import a1_loopingstatement.for2;

public class string_reverse {

	public static void main(String[] args) {
		String name="Archana";
		String name1="";
		
		for(int x=name.length()-1; x>=0;x--) {
			name1=name1+name.charAt(x);
		}

		System.out.println(name1);
	}

}
