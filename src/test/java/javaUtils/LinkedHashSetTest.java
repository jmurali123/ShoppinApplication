package javaUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetTest {

    public static void main(String args[]){
        List<Integer> lst= new ArrayList<>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(2);
        System.out.println("List elements "+lst);
        LinkedHashSet<Integer> lhs= new LinkedHashSet<>(lst);
        lhs.add(1);
        lhs.add(6);
        System.out.println("Linked HashSet " +lhs);


    }
}
