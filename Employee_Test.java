//15
class Employee{
private String firstName;
private String lastName;
private double salary;

public Employee(String fName,String lName, double sal) {
	if(fName!=null)firstName=fName;
	if(lName != null)lastName =lName;
	if(sal>0.0) {
		salary = sal;
	}
	else {
		salary=0.0;
	}
}
public String getfirstName() {
	return firstName;
}
public String getlastName() {
	return lastName;
}
public double getsalary() {
	return salary;
}
public void setfirstName(String fName) {
	
	if(fName!=null)
		firstName= fName;
}
public void setlastName(String lName) {
	
	if(lName!=null)
		lastName= lName;
}
public void setsalary(double sal) {
	
	if(sal > 0.0) {
		salary= sal;
}
else
{
	salary = 0.0;
}
}
}
public class Employee_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee employee1=new Employee("raj ","riya",10000.00);
Employee employee2=new Employee("rima ","siya",40000.00);

System.out.printf("\nNo:\tNAME\t\t\tYEARLY SALARY\n");
System.out.printf("1:\t%s%s\t\t$%.2f\n",
		employee1.getfirstName(),employee1.getlastName(),employee1.getsalary());

System.out.printf("2:\t%s%s\t\t$%.2f\n",
		employee2.getfirstName(),employee2.getlastName(),employee2.getsalary());

	
employee1.setsalary((1*employee1.getsalary())+employee1.getsalary());
employee2.setsalary((1*employee2.getsalary())+employee2.getsalary());

System.out.printf("\n10 percent salary raised..\n");
System.out.printf("1:\t%s%s\t\t$%.2f\n" ,employee1.getfirstName(),employee1.getlastName(),
		employee1.getsalary());
System.out.printf("2:\t%s%s\t\t$%.2f\n" ,employee2.getfirstName(),employee2.getlastName(),
		employee2.getsalary());
	}
	}


