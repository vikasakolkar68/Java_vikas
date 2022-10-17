package collection;

import java.util.HashMap;
import java.util.Map;

public class a5 {

	public static void main(String[] args) {
		// here we can store value in key value pair
		
		Map map=new HashMap();
		
		map.put("name", "jerry");
		map.put("roll no", 1);
		map.put("marks", 98);
		
		System.out.println(map.get("name"));
		System.out.println(map.get("marks"));
		System.out.println(map);
		
		map.clear();
		
		
		
		
		
		
		
		
		
		//Map map=new HashMap();
		
	
		
		//map.put("Name", "Vikas");
		//map.put("Class", "BE");
		//map.put("Roll No", "149001");
		//map.put("Marks", 99);
		
		//System.out.println(map.get("Name"));
		//System.out.println(map.get("Class"));
	}

}
