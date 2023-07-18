package javaUtils;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class EmpTest {

    public static void main(String args[]){
     //   Integer a;
        Employee[] arr= new Employee[4];
        arr[0]= new Employee(4,"Rajesh",25,50000);
        arr[1]= new Employee(3,"Sukriti", 24,60000);
        arr[2]= new Employee(1,"Bhavani",23,58000);
        arr[3]= new Employee(2,"Sudha", 22,74000);


        for(Employee emp:arr){
            emp.display();
        }
        Arrays.sort(arr);
        for(Employee emp:arr){
            emp.display();
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,new EmpComparator());
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,Employee.salComp);
        System.out.println(Arrays.toString(arr));
     //  System.out.println(Arrays.toString(arr));
      /*  ArrayList<Integer> lst=new ArrayList<Integer>();
        lst.add(10);
        lst.add(20);
        Integer arr1[]=new Integer[lst.size()];
       arr1=lst.toArray(arr1);*/






    }
}
