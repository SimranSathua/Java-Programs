package simran;
import java.util.Scanner;
public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks[] = new int[5];
int i;
float total=0,avg;
Scanner scanner = new Scanner(System.in);

for(i=0; i<5; i++) {
	System.out.print("enter marks of the subject"+(i+1)+":");
	marks[i] = scanner.nextInt();
	total = total + marks[i];
	
}
scanner.close();
avg = total/5;
System.out.print("the student grade is: ");
if(avg>=80)
{
	System.out.print("A");
}
else if(avg>=60 && avg<80)
{
	System.out.print("B");
}
else if(avg>=40 && avg<60)
{
	System.out.print("C");
}
else
{
	System.out.print("D");
}
	}

}
