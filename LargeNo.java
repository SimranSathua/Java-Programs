//6
import java.util.Scanner;
public class LargeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no1,no2;
Scanner sc = new Scanner(System.in);
System.out.println("enter 1st no");
no1=sc.nextInt();
System.out.println("enter 2nd no");
no2=sc.nextInt();
if(no1>no2){
System.out.println(no1+" is larger");
}

else if(no1<no2){

System.out.println(no2+" is larger");
}
else  {

	

	System.out.println("these no are equal");
}
	
	}

}
