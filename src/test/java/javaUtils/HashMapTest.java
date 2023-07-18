package javaUtils;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String args[]){
        HashMap<String, Integer> hm=new HashMap();
        hm.put("Science", 97);
        hm.put("English",96);
        hm.put("Science",96);
        hm.replace("Science",99);
        hm.put("Maths",100);
        hm.put("Hindi",70);
        hm.put(null,30);
        System.out.println(hm);
        hm.remove("Hindi");
        System.out.println("Science marks "+hm.get("Science"));
        System.out.println("Keys" +hm.keySet());
        System.out.println("Values" +hm.values());
        System.out.println(" Key & value" +hm.entrySet());
        //

         for(Map.Entry<String,Integer> entry :hm.entrySet()){
            // System.out.println(entry);
             System.out.println(entry.getKey() +" " + entry.getValue());
         }

    }


}
