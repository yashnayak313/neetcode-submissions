class Solution {
    public int longestConsecutive(int[] nums) {

        TreeSet<Integer> set = Arrays.stream(nums).boxed().
        collect(Collectors.toCollection(TreeSet::new));

        if(nums.length == 0) {
            return 0;
        }
       int first = set.first();

       int seq_count = 1;

       int max_seqcount = 0;

        for(int val : set) {

          System.out.println("Hi" + val);
            if(val - first == 1) {
                seq_count++;
              
            }
            else {
                max_seqcount = Math.max(seq_count, max_seqcount) ;
                seq_count = 1;
            }
            first = val;

        }

        return Math.max(max_seqcount, seq_count);
        
    }
}
