package com.company;
import java.util.Vector;


public class Main {

    public static void main(String[] args) {
        Vector<Employee> employees = new Vector<Employee>();
        Employee employee1 = new Employee("Nurzhigit", "Smailov", 20);
        Employee employee2 = new Employee("Mewok", "Mewkov", 20);
        employees.add(employee1);
        employees.add(employee2);

        Person person1 = new Employee("Nurzhigit", "Smailov", 20, 20);

        for(int i = 0;i < employees.size(); ++i){
            System.out.println("Full: " + (i+1) + ": " + employees.get(i).getName() + " " +
                    employees.get(i).getSurname()  + " " + employees.get(i).getAge());
            System.out.println(employees.get(i).toString());
        }


        /*
        1.
         Encapsulation getter and setter to private fields
         Inheritance give fields and methods from child class
         Polymorphism Person person = new Student(name, surname, age)
         Abstract class give some fields and methods to realize
        */



        /*
        2. page 123
            Interface vs Abstract Class
            1) In Interface only a signature without implementation, but Abstract class can have concrete methods
            2) In Interface only final fields,
                                    keep in mind Interface never contain instant fields
            3) Extending only  one abstract class, implements from many interface class
            4) Interface can be empty, Abstract class must have one abstract method
        */



        /*
        3.
            Overloading and Overriding
            1) Overloading in one class many methods have written with same name
            2) Override, rewrite functions from abstract class or from  interface, or from documentation

         */



        /*
        4.
            Methods: compareTo, equals, toString, get, set, copyMethod
            Words: this(), super(), super.method()
            Constructors: this(), super(), empty constructor,Person(),  Person(name, surname, age)
        */



        /*
        5.
            Marker Interfaces:
            1) Serializable
            2) Cloneable
            Interfaces which have not methods and fields
         */



        /*
        6.
            Types of Cloning:
            1) Shallow Cloning
                               Cloning fields but it refer to one thing in server, saved in one place
            2) Deep Cloning
                            Cloning fields to new place in server, in memory
         */
    }
}
