package simran;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int year = s.nextInt();
boolean x= false;
if(year % 400 == 0)
{
	x = true;
}
else if (year % 100 == 0)
{
	x = false;
}
else if(year % 4 == 0)
{
	x = true;
	
}
else
{
	x = false;
}
if(x)
{
	System.out.println("year"+year+" is a leap year");
}
else
{
	System.out.println("year"+year+"is not a leap year");
}
	}
}

