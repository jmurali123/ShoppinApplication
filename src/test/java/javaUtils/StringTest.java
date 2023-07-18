package javaUtils;

public class StringTest {
    public static void main(String args[]){
        //Declaring a string // JVM creates an object
        String s="Hello";
        //5  s.charAt(0)
        System.out.println(s);
    /*    String s1= new String("Hello");
        System.out.println(s1);
        char charr[]={'H','E','L','L','O'};
        String s2= new String(charr);
        System.out.println(s2);
        String s3= new String(charr,2,3);
        System.out.println(s3); */
         s=s.concat("world");
        System.out.println(s);
        String s2="Hello".concat("selenium");
        System.out.println(s2);

        System.out.println(s+s2);

        //length()
        System.out.println(s.length());

        //char charAt(int )
        System.out.println(s.charAt(2));

        //compareTo
     //   s1 and s2 // if a1=a2 => 0 // if a1>a2 => positive value// if a1<a2 => negative value
        String a1="A";
        String a2="a";
        String a3="A";
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareToIgnoreCase(a2));
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));

        //boolean startsWith(string)
        String a4="Selenium";
     //   System.out.println(a4.startsWith("S"));
        System.out.println(a4.endsWith("m"));
       // indexof
      //  System.out.println(a4.indexOf("ZXR"));
        System.out.println(a4.indexOf("e"));
        System.out.println(a4.lastIndexOf("e"));

       // replace
       a4=a4.replace('e','a');
       System.out.println(a4);
       System.out.println("Tendulkar".substring(2,6));

       //toLowerCase/ toUpperCase
        //trim()
        //getChars
        //split


    }
}
