package javaUtils;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String args[]) {
        HashSet<String> hs = new HashSet<>();
        // 5*0.75=3 or 4- it doubles the size - 10
        // 16 - default capacity and loadfactor 0.75 -> size would be 32 if 12 element is added.

        hs.add("India");
        hs.add("America");
        hs.add("Japan");
        hs.add("china");
        hs.add("India");

        System.out.println("Hash set values =" +hs);

        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        HashSet<String> hs1 = new HashSet<>();
        hs1.addAll(hs);
        hs1.add("Australia");

        System.out.println("New Hashset"+hs1);
        hs1.remove("Japan");
        hs1.remove("America");
        hs1.remove("china");
        System.out.println("New Hashset after removal"+hs1);

        hs1.retainAll(hs);
        System.out.println("After retain all"+hs1);


    }

}
