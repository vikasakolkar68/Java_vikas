
public class Test4 {
	
	public static void main(String[] args) {
	
		int[] a = {1};
		Test4 t=new Test4();
		t.increament(a);
		System.out.println(a[a.length - 1]);
		

}

	 void increament(int[] i) {
		i[i.length - 1]++;
	}
}