package com.company;

public class Person{
    private String name;
    private String surname;
    private int age;
    protected int mass, height;

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.length() > 0){
            this.name = name;
        }
    }
    public String toString(){
        return "Name: " + name + "\n" + "Surname: " + surname + "\nAge: " + age + "\n";
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        if(surname.length() > 0) this.surname = surname;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age  > 0)this.age = age;
    }
    public boolean equals(Object o){
        if(o == null) return false;
        else if(o == this)  return true;
        else if(!(o instanceof Employer)) return false;
        Person p = (Person) o;
        return p.getName() == this.name &&  p.getSurname() == this.surname
                && p.getAge() == this.age;
    }

}
