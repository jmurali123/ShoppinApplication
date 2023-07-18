package javaUtils;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String args[]){
        TreeSet<Integer> ts= new TreeSet<>();
        ts.add(4);
        ts.add(9);
        ts.add(0);
        ts.add(-1);
        ts.add(null);
        System.out.println(ts);
    }
}
