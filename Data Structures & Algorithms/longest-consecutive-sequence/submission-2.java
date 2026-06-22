class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = Arrays.stream(nums).boxed().
        collect(Collectors.toCollection(HashSet::new));

        if(nums.length == 0) {
            return 0;
        }

        int max_count = 0;
        int count = 1;
        for(int val : set) {

            if(!set.contains(val - 1)) {

                  count = 1;
                
                while(set.contains((val + count))) {
                    
                    count++;
                }
            }

            max_count = Math.max(max_count, count);
        }

        return max_count;
      
        
    }
}
