import java.util.Scanner;
public class FibonacciEx1 {

	public static void main(String[] args) {
		
		System.out.println("enter the length of fibonacci series:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		fibonacci(n);

	}
	public static void fibonacci(int count)
	
	
	{
		int n1=0,n2=1,n3,i;
		System.out.print(n1+""+n2);
		
		for(i=2;i<count;i++) {
			n3=n1+n2;
			System.out.print(""+n3);
			n1=n2;
			n2=n3;
		}
	}

}
