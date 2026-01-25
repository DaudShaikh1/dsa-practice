package org.dsa;

import java.util.HashMap;
import java.util.Map;

public class LongestKZeroSum {
    public static void main(String[] args) {
        int[] nums= {9,-3,3,-1,6,-5};
        int ans=getZeroSum(nums);
        System.out.println(ans);
    }


    public static int getZeroSum(int[] nums){
        Map<Integer,Integer> mp= new HashMap<>();
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(mp.containsKey(sum)){
                max=Math.max(max,i-mp.get(sum));
            }else mp.put(sum,i);

        }
        return max;
    }

}
