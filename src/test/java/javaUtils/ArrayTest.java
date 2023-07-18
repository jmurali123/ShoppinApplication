package javaUtils;

public class ArrayTest {

    public static void main(String args[]){
        int marks[]={50,60,55,67,70};
        int rollnos[]= new int[]{1,2,3,4,6};
        ;

        float salary[]=new float[50];
        float[] salary1=new float[50];

        char ch[]={'a','b','c'};
        String name[]={"John","Dravid"};



        System.out.println(marks.length);

        for(int i=0;i<marks.length;i++){

            System.out.println(marks[i]);
        }

        for(int mark:marks){
            System.out.println(mark);
        }

    }
}
