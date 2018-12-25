package com.company;

public class Employer extends Person{

    private int salary;

    public int getSalary(){
        return salary;
    }

    public Employer(String name, String surname, int age, int salary){
        super(name, surname, age);
        this.salary = salary;
    }
    public Employer(String name ,String surname, int age){
        super(name, surname, age);
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public boolean equals(Object o){
        if(o == null) return false;
        else if(!(o instanceof Employer)) return false;
        else if(o == this) return true;
        else{
            Employer copy = (Employer) o;
            return copy.salary == salary && super.equals(o);
        }
    }

    public String toString(){
        return super.toString()  + "Employer's salary: " + this.getSalary();
    }

    public int compareTo(Object object){
        Employer other = (Employer)object;
        if(other.getSalary() > salary) return -1;
        else if(other.getSalary() < salary) return 1;
        return 0;
    }

}
