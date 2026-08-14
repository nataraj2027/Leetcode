class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] res = new int[n];
        int hotSoFar = 0;
    
        /*for (int i = 0; i < n; i++){

            int j = i + 1; 
            while (j < n) {

                if (temperatures[j] > temperatures[i]){

                    res[i] = j - i;
                    break;
                }
                j++;
            }
        }
        return res;*/

        for(int i = n - 1; i >= 0; i--){

            int currTemp = temperatures[i];

            if(currTemp >= hotSoFar){

                hotSoFar = currTemp;
                continue;
            }

            int j = i + 1;

            while(temperatures[j] <= currTemp){

                j += res[j];
            }
            res[i] = j - i;
        }
        return res;
    }
}