package com.company;

public class Employee extends Person implements Cloneable{
    public static int employeeID = 0;
    private  int salary;

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        if(salary > 0) this.salary = salary;
    }


    @Override
    public String toString(){
        return super.toString() + "Salary: " + this.salary;
    }

    public Employee(String name, String surname, int age){
        super(name, surname, age);
        employeeID++;
    }

    public Employee(String name, String surname, int age, int salary){
        super(name, surname, age);
        this.salary = salary;
        employeeID++;
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null) return false;
        if(!(object instanceof Employee)) return false;
        Employee copy = (Employee) object;
        return copy.getAge() == getAge()  && copy.getName() == getName() && copy.getSurname() == getSurname();
    }

    /*
    public Employee clone() throws CloneNotSupportedException{
        return (Employee) super.clone();
    } // shallow cloning
    */
    public Employee clone() throws CloneNotSupportedException{
        Employee cloned = (Employee) super.clone();
        return cloned;
    }

}
