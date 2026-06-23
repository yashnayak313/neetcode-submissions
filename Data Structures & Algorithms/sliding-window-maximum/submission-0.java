class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         
         int n = nums.length;

          int result[] = new int[n-k+1];

            Deque<Integer> dq = new ArrayDeque<>();

            int left = 0;

          for(int i = 0; i < n; i++) {

                while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                    dq.pollLast();
                } 

                dq.addLast(i);

                if(dq.peekFirst() < left) {
                    dq.pollFirst();
                }

                if(i >= k - 1) {
                    result[left] = nums[dq.peekFirst()];
                    left++;
                }


          }

          return result;
    }
}
