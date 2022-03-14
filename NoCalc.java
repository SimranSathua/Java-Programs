//5
import java.util.Scanner;
public class NoCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int number1=0, number2=0;
System.out.printf("Number Calculations\n\n");
System.out.printf("Enter 1st number:\t");
number1= sc.nextInt();
System.out.printf("Enter 2nd number:\t");
number2=sc.nextInt();
//display the result
System.out.printf("  \n");
System.out.printf("\tSum =\t\t%d\n", number1+number2);
System.out.printf("\tproduct =\t%d\n", number1-number2);
System.out.printf("\tdufference=\t%d\n", number1-number2);
System.out.printf("\tQuotient = \t %d\n", number1/number2);
	}

}
