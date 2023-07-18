package javaUtils;

import java.util.HashSet;

public class HashSetTest2 {

    public static void main(String args[]){
        HashSet<Integer> a= new HashSet<>();
        a.add(2);
        a.add(3);
        a.add(5);

        HashSet<Integer> b= new HashSet<>();
        b.add(1);
        b.add(3);
        b.add(5);
        b.add(null);
        a.removeAll(b);
        System.out.println(a);

       // a.containsAll(b)

    }
}
