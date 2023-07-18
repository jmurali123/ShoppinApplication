package javaUtils;

public class Stringreversetest {

    public static void main(String args[]){
        String s="Welcome to selenium";
        String strrev="";
        for(int i=s.length()-1;i>=0;i--){
            strrev=strrev+s.charAt(i);
        }
        System.out.println(strrev);
   /*     for(int i=0;i<s.length();i++){
            strrev=s.charAt(i)+strrev;
        } */

        String [] a=s.split(" ");
        System.out.println(a.length);
        String newrev="";
        System.out.println(newrev);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            newrev=a[i]+" "+newrev;
        }
        System.out.println(newrev);

       // Welcome to selenium emocleW ot muineles
    }
}
