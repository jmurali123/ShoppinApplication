package javaUtils;

public class SecondMax {
    public static void main(String args[]){
      int nums[]=new int[]{40,50,30,45,10};
      int firstMax,secMax;
      firstMax=nums[0];
      secMax=nums[0];

      for(int i=1;i<nums.length;i++){
        if(firstMax<nums[i]){
            secMax=firstMax;
            firstMax=nums[i];
        }
        else if(secMax<nums[i]&& nums[i]!=firstMax){
            secMax=nums[i];
        }
      }
      System.out.println(secMax);


    }
}
