//7
import java.util.Scanner;
public class CheckNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int num1;
int num2;
int num3;
int sum;
int average;
int product;
double largest , smallest;


System.out.print("Enter 1st Integer: ");
num1 = sc.nextInt();

System.out.print("Enter 1st Integer: ");
num2 = sc.nextInt();

System.out.print("Enter 1st Integer: ");
num3 = sc.nextInt();

sum = num1 + num2 + num3;
average = sum/3;
product = num1 * num2 * num3;

largest = num1;
smallest = num1;

if(num2 > largest)
	largest = num2;
if(num3 > largest)
	largest = num3;
if(num2 < smallest)
	smallest = num2;
if(num2 < largest)
	smallest = num3;

System.out.println("The sum " + sum);

System.out.println("The average is " + average);

System.out.println("The product is " + product);

System.out.println("Largest of three integers is " + largest + "and the smallest is "+ smallest + ",");



	}

}
