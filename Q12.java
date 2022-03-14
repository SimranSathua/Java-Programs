import java.util.Scanner;
public class Q12 {
public static double Average(int grades[], int max) {
int sum=0;
double average=0.0;
for(int i=1;i<max;i++) {
	sum+=grades[i];
	average=sum/(i);
}
return average;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int i,grades[];
grades=new int[20];
for(i=0;i<20;i++) {
	System.out.printf("enter grade");
	grades[i]=sc.nextInt();
	if(grades[i]==-1)break;}
System.out.printf("%.2f",Average(grades, i-1));
}
	}


