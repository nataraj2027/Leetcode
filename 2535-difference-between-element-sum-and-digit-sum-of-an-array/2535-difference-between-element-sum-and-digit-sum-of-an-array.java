class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0;i<nums.length;i++){
           sum1 += nums[i];
        }

        for(int i = 0;i<nums.length;i++){
            int n = nums[i];
            if(n<9){
                sum2+= n;
            }else{
                while(n > 0){
                    int temp = n % 10;
                    sum2+= temp;
                    n= n/10;
                }
            }
            
        }

        return Math.abs(sum2 - sum1);
        
    }
}