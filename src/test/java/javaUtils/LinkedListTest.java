package javaUtils;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String args[]) {
        List<String> lst = new LinkedList<String>();
        lst.add("America");
        lst.add("India");
        lst.add("Japan");
        lst.set(1,"Russia");
        lst.add(null);
        lst.add("Russia");
        lst.add(null);
        System.out.println("LinkedList "+lst);

        lst.add(2,"China");

        System.out.println("Updated LinkedList "+lst);

        lst.remove(3);
        System.out.println("removed Japan from LinkedList "+lst);

        lst.set(2,"Japan");
        System.out.println("After setting Japan to the  LinkedList "+lst);

        String[] str= lst.toArray(new String[0]);
        System.out.println(str.length);

    }
}
