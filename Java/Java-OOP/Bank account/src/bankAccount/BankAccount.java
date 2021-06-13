package bankAccount;

public class BankAccount {
	private long accNum;
	private Double balance=0.00;
	private Double savings=0.00;
	static int numberOfAccounts;
	static int totAmount;
	public BankAccount() {
		numberOfAccounts++;
		totAmount++;
		Random();
	}
	
		long Random() {
			java.util.Random r = new java.util.Random();
			accNum = r.nextInt(999999999)+1000000000;
			System.out.println(accNum);
			return accNum;
		
		
	}

		public Double getBalance() {
			return balance;
		}

		public void setBalance(Double balance) {
			this.balance += balance;
		}

		public Double getSavings() {
			return savings;
		}

		public void setSavings(Double savings) {
			this.savings += savings;
		}
		
		public Double getWithdraw() {
			return balance;
		}
		public void setWithdraw(Double balance) {
			if ( this.balance > balance) {
				this.balance-=balance;
			}
			System.out.println(this.balance);
		}
		public void printAmount() {
			System.out.println(balance);
			System.out.println(savings);
		}
	
}
