package javaUtils;

import java.util.*;

public class ArrayListTest2 {

    public static void main(String args[]){
        ArrayList<String> lst=new ArrayList<String>(101);

        lst.add("Apple");
        lst.add("Mango");
        lst.add("Grapes");
        lst.add("Guava");
        lst.add(2,"cherry");
        lst.set(2,"Berry");
     //   lst.set(1,"Applee");


        System.out.println(lst);

        lst.remove(3);
        lst.remove("Apple");
        System.out.println("Contents after removing"+lst);
        System.out.println("Contents size after removing"+lst.size());


        Iterator it= lst.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(String s: lst){
            System.out.println(s);
        }
        //Listiterator

        ListIterator listIterator = lst.listIterator();
        listIterator.add("Guava");
        listIterator.next();
        listIterator.set("Cucumber");
        System.out.println(lst);
        while ((listIterator.hasNext())){
            System.out.println("===From List iterator "+listIterator.next());
        }
        while ((listIterator.hasPrevious())){
            System.out.println("===From List iterator "+listIterator.previous());
        }



        ArrayList<String> list3= new ArrayList<String>();

        list3.add("Sachin");
        list3.add("Dravid");
        list3.add("Ganguly");

       Enumeration enumeration=Collections.enumeration(list3);

       while(enumeration.hasMoreElements()){
           System.out.println(enumeration.nextElement());
       }


       List<String> newlst= new ArrayList<String>();









    }
}
