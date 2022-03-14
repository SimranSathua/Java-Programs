package simran;
import java.util.Scanner;
public class Blooddonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.print("your Age");
   int a = sc.nextInt();
   System.out.println("your weight");
   int w = sc.nextInt();
   if(a>=20 && w>=40)
   {
	   
	   System.out.println("you are eligible to donate blood");
	}
	else {
		

		System.out.println("you are not eligible to donate blood");
	}
}
}
