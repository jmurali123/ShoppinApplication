package javaUtils;

public class StringTest2 {

    public static void main(String args[]){
        String str="Welcome to Selenium";
        String[] a=str.split(" ");
        String rev="";
        for(String s:a){
            StringBuilder sb= new StringBuilder(s);
           // sb.reverse();
            rev=rev+sb.reverse()+" ";

        }
        System.out.println(rev);
    }
}
