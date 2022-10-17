package a7Constructor;

public class cls2 {
	
	// Parameterize constructor

	String name;
	int marks;
	
	cls2(String name, int marks) {
		
		this.name=name;
		
		this.marks=marks;
		
		System.out.println(name+" "+marks);
	}
	
	
	public static void main(String[] args) {
		
		cls2 c4=new cls2("tejas", 59);
	
		cls2 c=new cls2("tom", 98);
		cls2 c1=new cls2("jerry", 87);
		cls2 c2=new cls2("bob", 99);
		cls2 c3=new cls2("shiv", 100);
		
		
		
		

	}

}
