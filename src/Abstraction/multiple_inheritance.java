package Abstraction;


interface printable{
	void print();
	
}
interface showable{
	void show();
	
}

public class multiple_inheritance implements printable,showable {
	
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Hii");
	}

	public static void main(String[] args) {
		multiple_inheritance a=new multiple_inheritance();
		a.print();
		a.show();

		
	}

}
