package encap;

public class studentdata {
	
	private int rollno;
	private String name;
	
	public  int getrollno() {
		return rollno;
	}
	public String getname() {
		return name;
	}
	
	public void setrollno(int rollno) {
		this.rollno=rollno;
	}
	public void setname(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		
		studentdata a=new studentdata();
		studentdata b=new studentdata();
		
		a.setrollno(1);
		a.setname("Vikas");
		
		b.setrollno(2);
		b.setname("Archana");
		
		System.out.println("student rollno:" +  a.getrollno());
		System.out.println("student name:" +  a.getname());
		System.out.println("student rollno:" +  b.getrollno());
		System.out.println("student name:" +  b.getname());
		
		
	}

}
