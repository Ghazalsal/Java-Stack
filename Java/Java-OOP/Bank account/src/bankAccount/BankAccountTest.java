package bankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bank1 = new BankAccount();
		BankAccount bank2= new BankAccount();
		System.out.println(BankAccount.numberOfAccounts);
		bank1.Random();
		bank2.getSavings();
		System.out.println(bank2.getSavings());
		bank2.setSavings(2000.00);
		System.out.println(bank2.getSavings());
		bank1.getBalance();
		bank1.setBalance(5000.00);
		
		System.out.println(bank1.getBalance());
		
		bank1.setWithdraw(4000.00);
		bank1.printAmount();
	}

}
