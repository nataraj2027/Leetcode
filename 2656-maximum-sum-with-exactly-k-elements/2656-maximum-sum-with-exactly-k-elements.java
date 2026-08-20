class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int maxSum = 0;
        int largest = nums[nums.length - 1];
        for(int i = 0; i < k; i++){
            maxSum += largest;
            largest++;
        }
    return maxSum;
    }
}