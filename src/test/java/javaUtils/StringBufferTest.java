package javaUtils;

public class StringBufferTest {

    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Welcome to selenium");
     //   sb.append(" World");
        System.out.println(sb);
        System.out.println(sb.reverse());

       StringBuilder sb1= new StringBuilder("I am StringBuilder");
       System.out.println(sb1);
        System.out.println(sb1.reverse());
    }
}
