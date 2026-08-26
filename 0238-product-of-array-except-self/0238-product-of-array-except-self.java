class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];

        int left = 1;
        for(int i =0;i<n;i++){
            res[i] = left;
            left = left * nums[i];
        }

        int right = 1;
        for(int j = n-1;j >=0;j--){
            res[j] = res[j] * right;
            right = right * nums[j];
        }

        return res;
    }
}