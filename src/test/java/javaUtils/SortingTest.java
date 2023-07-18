package javaUtils;

public class SortingTest {
    public static void main(String args[]){
        int [] nums={30,12,45,20,15};
        System.out.println(nums.length);
        //12,15,20,30,45
       // int temp;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                   nums[i]=nums[i]+nums[j];
                   nums[j]=nums[i]-nums[j];
                   nums[i]=nums[i]-nums[j];

                  //  nums[i]=nums[j];
                  // nums[j]=temp;
                }
            }
        }
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
