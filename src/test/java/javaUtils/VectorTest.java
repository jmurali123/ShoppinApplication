package javaUtils;

import java.util.Collections;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest {

    public static void main(String args[]){
        Vector<Integer> v= new Vector<>();
        v.add(22);
        v.add(50);
        v.add(10);

        for(int i=0;i<v.size();i++) {

            System.out.println("for loop "+v.get(i));
        }

        ListIterator lit=v.listIterator();
        System.out.println("============Forward=========");
        while(lit.hasNext()){
          System.out.println(lit.next()+"\t");
        }
        System.out.println("============Backward=========");
        while (lit.hasPrevious()){
            System.out.println(lit.previous()+"\t");
        }

        Collections.sort(v);
        System.out.println(v);
    }
}
