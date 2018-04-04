package com.nowcoder.First.SingleNumber;

public class SelfSolution {
    public int singleNumber(int[] nums) {
        int findNum=-1;
        for(int n=0;n<nums.length;n++){
            if(isSignal(nums[n],nums)){
                findNum=nums[n];
            }
        }
        return findNum;
    }
    
    boolean isSignal(int testNum,int[] nums){
        int point=0;
        for(int n=0;n<nums.length;n++){
            if(testNum==nums[n]){
                point++;
            }
        }
        if(point==1){
            return true;
        }else{
            return false;
        }
    }
}