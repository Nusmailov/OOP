package Problem2;

public abstract class Account {
	private double balance;
	private int accNumber;
	abstract public void update();
	
	public Account(int a) {
		balance = 0.0;
		accNumber = a;
	}
	public void deposit(double sum){ balance += sum;}	
	public void withdraw(double sum){ balance -= sum;}
	
	public double getBalance(){ return balance;}
	public void setBalance(double balance) { this.balance = balance;}
	
	public double getAccountNumber(){ return accNumber; }
	public void setAccountNumber(int accNumber){ this.accNumber = accNumber; }
	
	public void transfer(double summa, Account other) {
		other.balance += summa;
		balance -= summa;
	}
	
	public String toString() { return accNumber + " " + balance; }
	public final void print() { System.out.println(toString()); }
}
