package collection;


import java.util.HashSet;
import java.util.Set;

public class a6 {

	public static void main(String[] args) {
		
		Set list=new HashSet();
		
		list.add(10);
		list.add(20);
		list.add("Vikas");
		list.add('a');
		list.add(100);
		
		System.out.println(list);
		
		list.remove(20);
		
		System.out.println(list.contains(100));
		
		list.clear();
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		
		
	
	}

}
