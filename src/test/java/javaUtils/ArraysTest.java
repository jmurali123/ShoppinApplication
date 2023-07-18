package javaUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest {
    public static void main(String args[]){
        Integer a[]={10,20,15,22,35};
        List<Integer> lst= Arrays.asList(a);
    //    lst.add(40);
        System.out.println(lst.size());
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int key=20;
       int index= Arrays.binarySearch(a,key);

       System.out.println(key+ "found at index =" + index);
       int b[]={10,15,22};
       int c[]={10,15,22};
       int equal=Arrays.compare(b,c);
       if(equal==0){
           System.out.println("Two arrays are equal");

       }
       else{
           System.out.println("Two arrays are not equal");
       }
      // System.out.println(Arrays.compare(c,b));

        int d[]=Arrays.copyOf(c,5) ;// 10 15 22 0 0


            System.out.println(Arrays.toString(d));

    //   System.out.println(Arrays.toString(Arrays.copyOf(c,10)));
       System.out.println(Arrays.toString(Arrays.copyOfRange(c,0,2)));




    }
}
