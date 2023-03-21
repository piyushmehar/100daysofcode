// 2348. Number of Zero-Filled Subarrays
// Given an integer array nums, return the number of subarrays filled with 0.
// A subarray is a contiguous non-empty sequence of elements within an array.

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long a =0, z=0;
        for(int n : nums){
            if(n==0){
                a += ++z;
            }
            else{
                z =0;
            }
        }
        return a;
        
    }
}
