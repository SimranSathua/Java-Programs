//16
import java.util.Scanner;
class Date{
	private int month;
	private int day;
	private int year;
	public Date(int MyMonth, int MyDay, int MyYear) {
		month = MyMonth;
		day = MyDay;
		year = MyYear;
	}
	public void setMonthDate(int MyMonth) {
		month = MyMonth;}
	
		public int getMonthDate() {
			return month;
		}
		public void setDayDate(int MyDay) {
			day = MyDay;}
		
			public int getDayDate() {
				return month;
			}
			public void setYearDate(int MyYear) {
				year = MyYear;
				}
			
				public int getYearDate() {
					return year;
				}
				public void displayDate() {
					System.out.printf("%d/%d/%d", month,day,year);
				
	}
}

public class Date_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
Date myDate = new Date(5, 12, 1999);
int myMonth = sc.nextInt();
myDate.setMonthDate(myMonth);

System.out.println("enter date");
int myDay = sc.nextInt();
myDate.setDayDate(myDay);
System.out.println("enter the year");
int myYear = sc.nextInt();
myDate.setYearDate(myYear);
myDate.displayDate();
	}

}
