package javaUtils;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
       // return o1.age- o2.age;
        if(o1.age< o2.age){
            return 1;
        }
        else if(o1.age>o2.age) {
            return -1;
        }
        else{
            return 0;
        }
    }
}
