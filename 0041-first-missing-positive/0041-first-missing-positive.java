class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            int curr = nums[i] - 1;
            if(nums[i]>0 && nums[i] <= n && nums[i] != nums[curr]){
                swap(nums,i,curr);
            }else{
                i++;
            }
        }
        for(i = 0 ; i<n;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }
    public void swap(int[] nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}