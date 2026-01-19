//977. Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sorted = new int[n];
        int left = 0;
        int right = n-1;
        int pos = n-1;

        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(leftSquare > rightSquare){
                sorted[pos] = leftSquare;
                left++;
            }else{
                sorted[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        return sorted;
    }
}

// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             nums[i] *= nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }