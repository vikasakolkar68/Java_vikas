package array;

public class b1 {

	public static void main(String[] args) {
		
		// multiple columns and rows 
		
		// declaration
		
		// int[][] a;   // mostly used
		// int [][]b;
		// int[] []c;
		// int d[][];
		// int[] e[];
		
		// declaration
        // int[][] a;
        
        //creation
        
       int [] [] a=new int [3][3];
        
        //initialization
        
        //   0   1  2
        // 0 10 20 30
        // 1 40 50 60
        // 2 70 80 90
        
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[1][0]=40;
        a[2][0]=70;
        a[2][1]=80;
        a[2][2]=90;
        
        System.out.println(a[2][1]);
        System.out.println(a[0][2]);
        
        
	}

}
