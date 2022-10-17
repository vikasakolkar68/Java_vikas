package a7Constructor;

public class cls3 {
	
	String name;
	int marks;
	
	cls3(String name,int marks){
	
		this.name=name;
		this.marks=marks;
		
		System.out.println(name+" "+marks);
		
	}
	public static void main(String[] args) {


		cls3 c=new cls3("Vikas",100);
		cls3 c1=new cls3("Vijay",99);
		
		
	
	}

}
