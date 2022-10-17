package encap;

public class a1 {
	
	private int RollNo=101;
	public void setRollNo(int RollNo) {
		this.RollNo=RollNo;
	}
	public int getRollNo() {
		return RollNo;
	}
	public static void main(String[] args) {
	 a1 a=new a1();
	 System.out.println(a.getRollNo());
	 a.setRollNo(102);
	 System.out.println(a.getRollNo());
	 a.setRollNo(103);
	 System.out.println(a.getRollNo());
	 

	}

}
