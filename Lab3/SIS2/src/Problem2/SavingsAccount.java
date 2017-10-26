package Problem2;

public class SavingsAccount extends Account {
	Account account;
	private double interest;
	public SavingsAccount(int a, double interest) {
		super(a);
		this.interest = interest;
	}	
	public void add() { deposit(account.getBalance() * interest / 100);}
	public void update() { add();}
}
