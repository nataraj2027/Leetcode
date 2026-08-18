class Solution {
    public boolean canAliceWin(int[] nums) {
        int ali = 0;
        int bob = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] <= 9){
                ali += nums[i];
            }else{
                bob += nums[i];
            }
        }
        if(ali > bob || bob > ali){
            return true;
        }else{
            return false;
        }
    }
}