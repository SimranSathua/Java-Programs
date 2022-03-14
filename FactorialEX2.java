
public class FactorialEX2 {
static int factorial(int n)
{
	int r =1,i;
	for(i=2;i<=n;i++)
		r*=i;
	return r;
}
	public static void main(String[] args) {
		{
			int num = 6;
			System.out.print("Factorial of"+num+"is" + factorial(6));
		}

	}

}
