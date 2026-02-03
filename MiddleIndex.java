//1991. Find the Middle Index in Array

class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum = 0, total = 0;
        for(int n : nums){
            total += n;
        }
        for(int i=0;i<nums.length;i++){
            total -= nums[i];
            if(total == leftSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}