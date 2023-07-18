package javaUtils;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    public Employee(int empID,String empname,int age, int salary){
        this.empID=empID;
        this.empname=empname;
        this.salary=salary;
        this.age=age;
    }
    int empID;
    String empname;
    int age;
    int salary;
    public void display(){
        System.out.println(this.empID + "  " + this.empname);
    }

    @Override
    public int compareTo(Employee o) {
        return (this.empID-o.empID);
    }
    public String toString(){
        return "[empID=" +this.empID + ", name="+ this.empname + ", age="+ this.age+ ",salary="
    + this.salary +"]" ;
    }

    public static Comparator<Employee> salComp= new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (o1.salary- o2.salary);
        }
    };
}
