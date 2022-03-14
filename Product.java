//2
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a,b,c;
int result;

System.out.print("enter 1st integer");
a= sc.nextInt();

System.out.print("enter 2nd integer");
b= sc.nextInt();

System.out.print("enter 3rd integer");
c= sc.nextInt();

result=a*b*c;
System.out.printf("Product is %d%n", result);
	}

}
