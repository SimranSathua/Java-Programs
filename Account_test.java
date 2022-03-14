import java.util.Scanner;
class Account{
	private double balance;
	public Account (double initialBalance) {
		
	if(initialBalance > 0.0)
		balance = initialBalance;
	}
	public void credit(double amount) {
		balance = balance+amount;
	}
	public void debit(double amount) {
		balance = balance-amount;
	}
	public double getBalance() {
		return balance;
	}
}

public class Account_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account acc1 = new Account(30.00);
Account acc2 = new Account(-2.00);
System.out.printf("Account1Balance: $%.2f\n",acc1.getBalance());
System.out.printf("Account2Balance: $%.2f\n",acc2.getBalance());

Scanner input = new Scanner("System.in");
double depositAmount;
double debitAmount;
System.out.println("enter deposit amount for account");
depositAmount = input.nextDouble();
System.out.printf("\nadding %. 2f to account1 balance\n\n",depositAmount);
acc1.credit(depositAmount);
System.out.printf("Account1 balance: $%.2f\n\n",acc1.getBalance());
System.out.printf("Account2 balance: $%.2f\n\n",acc2.getBalance());
System.out.println("enter deposit amount for account2");
depositAmount = input.nextDouble();


System.out.printf("\nadding %. 2f to account2 balance\n\n",depositAmount);
acc2.credit(depositAmount);
System.out.printf("Account1 balance: $%.2f\n\n",acc1.getBalance());
System.out.printf("Account2 balance: $%.2f\n\n",acc2.getBalance());
System.out.println("enter debit amount for account1");
debitAmount =input.nextDouble();
System.out.printf("\nsubtracting %.2f from account1 balance\n\n",debitAmount);

if
(acc1.getBalance()>=debitAmount) {
	acc1.debit(debitAmount);
	System.out.printf("Account1 balance:$%.2f\n\n",acc1.getBalance());
	
	System.out.printf("Account2 balance:$%.2f\n\n",acc2.getBalance());
}
else {
	System.out.printf("Debit amount exceeded account balance\n\n");
	System.out.println("enter debit amount for account2");
	debitAmount =input.nextDouble();
	System.out.printf("\nsubtracting %.2f from account2 balance\n\n",debitAmount);
	
	if
	(acc1.getBalance()>=debitAmount) {
		System.out.printf("Account1 balance:$%.2f\n\n",acc1.getBalance());
		
		System.out.printf("Account2 balance:$%.2f\n\n",acc2.getBalance());
	}
	else {
		System.out.printf("Debit amount exceeded account balance\n\n");
	}
}


	}

}
