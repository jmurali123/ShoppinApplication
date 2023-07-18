package javaUtils;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String args[]){
        Employee emp= new Employee(1,"Rajesh",25,70000);
        ArrayList a= new ArrayList();
        a.add(10);
        a.add("Rahul");
        a.add(emp);
       // a.size();

        System.out.println(a.get(0));
    //    System.out.println(a.get(1));
        Employee ref=(Employee)a.get(2);
        ref.display();
        //System.out.println();
//****************************************


        ArrayList<Integer> lst= new ArrayList<Integer>();
        lst.add(20);


    }
}
