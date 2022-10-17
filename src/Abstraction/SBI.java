package Abstraction;

interface bank{           // methods, fields
	
	void ROI();    // by default consider public abstract 
	
	     // by default consider public static final
	
}

public class SBI implements bank{
	
	public void ROI() {
		System.out.println("SBI ROI is 12%");
	}

	
	public static void main(String[] args) {
		
		SBI sbi=new SBI();
		sbi.ROI();
		

	}

}
