class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int orgcapacity = capacity;
        for(int i = 0; i < plants.length; i++){
            if(plants[i] <=  capacity){
                capacity -= plants[i];
                steps ++;
            }
            else{
                steps +=i;
                capacity = orgcapacity;
                steps += i+1;
                capacity -= plants[i];
            }
        }
        return steps;
    }
}