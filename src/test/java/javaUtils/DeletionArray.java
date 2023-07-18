package javaUtils;

import java.util.Arrays;

public class DeletionArray {

    public static void main(String[] args){
        int [] arr=new int[]{1,2,3,4,5};
        int rem=3;
        int [] newarr=new int[arr.length-1];
        for(int i=0, j=0;i<arr.length;i++){
            if(arr[i]!=rem){
                newarr[j]=arr[i];
                j++;
            }
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newarr));
    }
}
