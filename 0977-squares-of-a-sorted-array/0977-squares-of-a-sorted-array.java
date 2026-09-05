class Solution {
    public int[] sortedSquares(int[] nums) {
        int left =0;
        int right = nums.length -1;
        while(left <= right){
            int val1 = nums[left] * nums[left];
            int val2 = nums[right] * nums[right];
            nums[left] = val1;
            nums[right] = val2;
            left++;
            right--;
        }
        Arrays.sort(nums);
     return nums;
        
    }
}