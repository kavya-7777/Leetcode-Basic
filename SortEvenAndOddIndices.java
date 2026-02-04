//2164. Sort Even and Odd Indices Independently

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;

        int[] evenArray = new int[(n + 1) / 2];
        int[] oddArray  = new int[n / 2];

        int e = 0, o = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) evenArray[e++] = nums[i];
            else oddArray[o++] = nums[i];
        }

        Arrays.sort(evenArray);
        Arrays.sort(oddArray);
        for (int i = 0, j = oddArray.length - 1; i < j; i++, j--) {
            int temp = oddArray[i];
            oddArray[i] = oddArray[j];
            oddArray[j] = temp;
        }

        e = 0;
        o = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) nums[i] = evenArray[e++];
            else nums[i] = oddArray[o++];
        }

        return nums;
    }
}
