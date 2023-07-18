package javaUtils;

import java.util.Hashtable;
import java.util.Map;

public class HashtableTest {

    public static void main(String args[]){
        Hashtable<String,Integer> ht=new Hashtable<>();
        ht.put("Sachin",40);
        ht.put("Dhoni",39);
        ht.put("Kohli",35);

        for(Map.Entry<String,Integer> e: ht.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
