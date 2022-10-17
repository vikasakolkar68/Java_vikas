package encap;

public class Employee {
	
	private int ID;
	private String Name;
	private String Dept;
	
	public int getID() {
		return ID;
	}
	public String getName() {
		return Name;
	}
	public String getDept() {
		return Dept;
	}
	public void setID(int ID) {
		this.ID=ID;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setDept(String Dept) {
		this.Dept=Dept;
	}
	public static void main(String[] args) {
		Employee a=new Employee ();
		Employee b=new Employee ();
		a.setID(001);
		a.setName("Vikas Devidas Akolkar");
		a.setDept("QA");
		b.setID(002);
		b.setName("Archana Vikas Akolkar");
		b.setDept("QC");
		
		System.out.println("Employee ID:-" + a.getID());
		System.out.println("Employee Name:-" + a.getName());
		System.out.println("Employee Dept:-" + a.getDept());
		System.out.println("Employee ID:-" + b.getID());
		System.out.println("Employee Name:-" + b.getName());
		System.out.println("Employee Dept:-" + b.getDept());
	}
}





   