class Solution {
    public int maxSum(int[][] grid) {
        int maxsum=0;
        for(int i=0;i<grid.length-2;i++)
        {
            for(int j=0;j<grid[i].length-2;j++)
            {
                int sum=0;
                int k=i;
                int l=j;
                for(int m=k;m<k+3;m++)
                {
                    for(int n=l;n<l+3;n++)
                    {
                        if(m==k+1 &&(n==l+0||n==l+2))
                        {
                            continue;
                        }
                        else
                        {
                            sum=sum+grid[m][n];
                        }
                    }
                }
                if(maxsum<sum)
                {
                    maxsum=sum;
                }
            }
        }
        return maxsum;
        
    }
}