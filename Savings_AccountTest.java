//17
class SavingsAccount{
	 public static double
	 annualInterestRate;
	 private double savingsBalance;
	 public SavingsAccount() {
		 annualInterestRate = 0.0;
		 savingsBalance = 0.0;
	 }
	 public SavingsAccount(double intRate, double savBal) {
		 annualInterestRate = intRate;
		 savingsBalance = savBal;
	 }
	 public double
	 calculateMonthlyInterest() {
		 double intRate = (savingsBalance * annualInterestRate/12);
		 savingsBalance = savingsBalance +
				 intRate;
		 return intRate;
	 }
	 public static void
	 modifyInterestRate (double
			 newInterestRate) {
		 annualInterestRate = newInterestRate;}
	 
	 public void
	 setSavingsBalance(double newBal){
		 savingsBalance = newBal;
	 }
				 public double getSavingsBalance()
				 {
					 return savingsBalance;
				 }
				 public double
				 getAnnualInterestRate() {
					 return annualInterestRate;
				 
	 
				 }
		 
	 }
	 
 
public class Savings_AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SavingsAccount saver1 = new SavingsAccount();
SavingsAccount saver2 = new SavingsAccount();
saver1.setSavingsBalance(2000.00);
saver2.setSavingsBalance(300.00);
SavingsAccount.modifyInterestRate(0.40);
saver1.calculateMonthlyInterest();
saver2.calculateMonthlyInterest();
System.out.printf("new Balance for Saver1 =%f\n", saver1.getSavingsBalance());
System.out.printf("new Balance for Saver2 =%f\n", saver2.getSavingsBalance());

SavingsAccount.modifyInterestRate(0.05);
saver1.calculateMonthlyInterest();
saver2.calculateMonthlyInterest();
System.out.printf("new balance for saver1=%f\n",saver1.getSavingsBalance());
System.out.printf("new balance for saver2=%f\n",saver2.getSavingsBalance());
	}

}
