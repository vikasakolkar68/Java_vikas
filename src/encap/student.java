package encap;

public class student {
	
	private int RollNo;
	private String Name;
	private String className;
	
	public int getRollNo() {
		return RollNo;
	}
	public String getName () {
		return Name;
	}
	public String className () {
		return className;
	}
	
	
	public void setRollNo(int RollNo) {
		this.RollNo=RollNo;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setclassName(String className) {
		this.className=className;
	}

	public static void main(String[] args) {
       student a=new student ();
       student b=new student ();
       a.setRollNo(1);
       a.setName("Vikas Devidas Akolkar");
       a.setclassName("BE");
       b.setRollNo(2);
       b.setName("Shivraj Sandip Chavan");
       b.setclassName("BSc");
       
       System.out.println("Student RollNo:" + a.getRollNo());
       System.out.println("Student Name:" + a.getName());
       System.out.println("Student className:" + a.className());
       System.out.println("Student RollNo:" + b.getRollNo());
       System.out.println("Student Name:" + b.getName());
       System.out.println("Student className:" + b.className());
	}
}
