import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int counter = 10,largest = 0;
int number[]=new int[10];
for(int i=0;i<counter;i++)
{
number[i]=input.nextInt();
}
for(int i=0; i<counter;i++)
{
	if(largest<number[i])
	{
		largest=number[i];
	}
}
System.out.println("largest="+largest);
	
	}

}
