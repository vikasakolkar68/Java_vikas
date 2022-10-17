import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("The box contain");
			int num = sc.nextInt();
			if(num<0){
			    System.out.println(num+" is not a valid input");
			    return;
			}
			else{
			    System.out.println("Enter the number");
			    int arr[] = new int[num];
			    int sum =0;
			    for (int i=0;i<num;i++){
			        int a = sc.nextInt();
			        if(a>0){
			            arr[i] = a;
			            sum += (arr[i]%10);
			        }
			        else{
			            System.out.println(a+" is not a valid input");
			        }
			    }


			    if(sum%2==0){
			        System.out.println(sum+" is even its valid box");
			    }
			    else {
			        System.out.println(sum+" is odd its invalid box");
			    }

			}
		}
    }
}