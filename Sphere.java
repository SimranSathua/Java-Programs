//10
import java.util.Scanner;
public class Sphere {
	public static double sphereVolume(double radius) {
		return(4.0/3.0)*Math.PI*Math.pow( radius,3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
double radius=0.0, volume=0.0;
System.out.printf("enter radius:");
radius=sc.nextInt();
System.out.printf("volume = %.3f", sphereVolume(radius));
	}

}
