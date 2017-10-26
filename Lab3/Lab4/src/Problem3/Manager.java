package Problem3;

import java.util.Vector;
import java.util.Date;

public class Manager extends Employee implements Comparable{
	private Vector team  = new Vector();
	private double bonus;
	
	public Manager(){
		super();
		bonus = 0;
	}
	
	public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus){
		super(name, salary, hireDate, insuranceNumber);
		this.bonus = bonus;		
	}
	
	public void addTeamMember(Employee e){
		team.addElement(e);
	}
	
	public Vector getTeam(){
		return this.team;
	}
	
	public void setBonus(double b){
		this.bonus = b;
	}
	public double getBonus(){
		return bonus;
	}




	public String toString(){
		String s = "";	
		for(int i = 0; i < team.size(); i++){
			s += ((Employee)team.get(i)).getName()+"\n";
		}
		
		return super.toString() + "\nBonus: " + this.bonus + "\nTeam Members:\n" + s;
	}
	
	public boolean equals(Manager M){
		return super.equals(M) && this.bonus == M.bonus;
	}
	
	
	public int compareTo(Object a) {
		Manager b = (Manager) a;
		if(b.getSalary() > this.getSalary()) {
			return 1;
		}
		if(b.getSalary() < this.getSalary()) {
			return -1;
		}
		
		if(b.getSalary() == this.getSalary()) {
			if(b.getBonus()  == this.getBonus()) {
				return 0;
			}
			else if(b.getBonus()  < this.getBonus()){
				return -1;
			}
			return 1;
		}
	
		return 0;
	}
	
}
