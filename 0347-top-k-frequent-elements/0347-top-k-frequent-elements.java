class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map <Integer, Integer> map = new HashMap<>();
        List <Integer> lst = new ArrayList();

        for(int n : nums)
            map.put(n, map.getOrDefault(n , 0) + 1);

       List <Map.Entry<Integer, Integer>> mapLst = new ArrayList<>(map.entrySet());
        mapLst.sort(Map.Entry.<Integer, Integer> comparingByValue().reversed()); 

        int counter = 0;

        for(Map.Entry<Integer, Integer> e : mapLst){

            if(counter != k){

                int key = e.getKey();
                lst.add(key);
                counter++;
            }  

            else break;          
        }


        int[] arr = new int[lst.size()];
        int idx = 0;

        for(int n : lst){

            arr[idx] = n;
            idx++;
        }

        return arr;
        
    }
}