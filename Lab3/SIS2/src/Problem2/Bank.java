package Problem2;

import java.util.Vector;

public class Bank{
	
	public Vector <Account> accounts;
	public Account ac;
	public Bank(){
		accounts = new Vector<Account>();
	}
	
	public void addToBank(){
		accounts.add(ac);
	}
	
	public void removeAcc(Account a) {
		accounts.remove(a);
	}
	
	public void update(){
		for(int i = 0; i < accounts.size(); ++i){
			accounts.get(i).update();
		}
	}
	
}
