package collection;

import java.util.ArrayList;
import java.util.List;

public class a1 {

	public static void main(String[] args) {
		
		// ArrayList:  we can store duplicate value
		//             we can handle by index
		
		List list=new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add("Vikas");
		list.add('a');
		list.add(10);
		System.out.println(list.get(2));
		
	
		
		System.out.println(list);
		

	}

}
