package Problem3;

import java.util.Vector;

public class Manager extends Employee{
	private Vector team  = new Vector();
	private double bonus;
	
	public Manager(){
		super();
		bonus = 0;
	}
	
	
	public Manager(String name, double salary, int year, String insuranceNumber, double bonus){
		super(name, salary, year, insuranceNumber);
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
}
