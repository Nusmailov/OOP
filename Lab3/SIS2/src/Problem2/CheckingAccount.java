package Problem2;
import java.util.*;
public class CheckingAccount extends Account{
	private int transaction;
	private int freetrans;
	private final double commission = 0.01;
	Vector<Account> users = new Vector<Account>();
	
	public CheckingAccount(int a, int freetrans) {
		super(a);
		this.freetrans = freetrans;
		transaction = 0;
	}
	
	public void transfer(double summa, Account another){
		super.transfer(summa, another);
		transaction++;
	}
	
	public void deductFee(){
		transaction -= Math.min(transaction,  freetrans);
		freetrans -= Math.min(transaction,  freetrans);
		withdraw(commission * transaction);
		transaction = 0;
	}
	void closingAccount(Account user) {
		for(int i = 0;i  < users.size();i++) {
			if(users.get(i).equals(user)) {
				users.remove(user);
			}
		}
	}
	public void update(){deductFee();}
}
