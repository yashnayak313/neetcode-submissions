class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {

            int a = map.containsKey(num) ? map.get(num) + 1 : 0;
            map.put(num,a);

            if(map.containsKey(num)) {
                if(map.get(num) > 0) {
                    return true;
                }
            } 
         
        }

        return false;
    }
}